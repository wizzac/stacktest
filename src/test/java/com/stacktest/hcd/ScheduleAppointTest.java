package com.stacktest.hcd;

import java.util.Date;

import org.junit.Test;

import com.stacktest.hcd.dto.PersonDto;
import com.stacktest.hcd.dto.ProfessionalMinDto;
import com.stacktest.hcd.dto.ScheduleSimpleDto;
import com.stacktest.hcd.dto.ServiceMinDto;

public class ScheduleAppointTest {
	public int idPersonPatient = 13;
	public int idPersonProfessional = 73572;//Cuk
	public int idService = 2727;

	@Test
	public void postOverscheduleForProfessional() {
		ScheduleSimpleDto reqDto = new ScheduleSimpleDto();
		reqDto.setOverSchedule(true);
		reqDto.setScheduledDateFrom(new Date());
		reqDto.setScheduledDateTo(new Date());
		reqDto.setTelemedicine(false);
		reqDto.setPerson(new PersonDto());
		reqDto.getPerson().setId(idPersonPatient);
		reqDto.setProfessional(new ProfessionalMinDto());
		reqDto.getProfessional().setId(idPersonProfessional);
		reqDto.setService(new ServiceMinDto());
		reqDto.getService().setId(idService);

		HCDConnection con = new HCDConnection("32811727M", "1234");
		con.setMensajePost(con.getGsonBuilder().create().toJson(reqDto));
		ScheduleSimpleDto respDto = con.ejecutar("POST", "/secure/healthCenter/22/schedule/overSchedule", ScheduleSimpleDto.class);
		assert respDto != null;
	}
}
