package com.stacktest.hcd;

import org.junit.Test;

import com.stacktest.hcd.dto.ScheduleDto;

public class ScheduleActionStatusTest {
	private int idScheduleAdmin = 295595;
	private int idScheduleCuk = 295561;
	private int idSchedulePacheco = 295580;
	private int idScheduleDomene = 290048;
	
	@Test
	public void callPatientScheduleForAdmin() {
		HCDConnection con = new HCDConnection("1M", "1234");
		ScheduleDto dto = con.ejecutar("PUT", "/secure/healthCenter/22/callPatientSchedule/" + idScheduleAdmin,
				ScheduleDto.class);
		assert dto != null;
	}

	@Test
	public void callPatientScheduleForCuk() {
		HCDConnection con = new HCDConnection("38830991M", "1234");
		ScheduleDto dto = con.ejecutar("PUT", "/secure/healthCenter/22/callPatientSchedule/" + idScheduleCuk,
				ScheduleDto.class);
		assert dto != null;
	}
	
	@Test
	public void callPatientScheduleForPacheco() {
		HCDConnection con = new HCDConnection("34312958M", "1234");
		ScheduleDto dto = con.ejecutar("PUT", "/secure/healthCenter/22/callPatientSchedule/" + idSchedulePacheco,
				ScheduleDto.class);
		assert dto != null;
	}
	
	@Test
	public void callPatientScheduleForDomene() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		ScheduleDto dto = con.ejecutar("PUT", "/secure/healthCenter/22/callPatientSchedule/" + idScheduleDomene,
				ScheduleDto.class);
		assert dto != null;
	}

	@Test
	public void cancelSchedule() {
		HCDConnection con = new HCDConnection("38830991M", "1234");
		ScheduleDto dto = con.ejecutar("PUT", "/secure/healthCenter/22/cancelSchedule/" + idScheduleDomene,
				ScheduleDto.class);
		assert dto != null;
	}
}
