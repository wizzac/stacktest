package com.stacktest.hcd;

import org.junit.Test;

import com.stacktest.hcd.dto.ScheduleDto;

public class ScheduleActionStatusTest {
	private int idSchedule = 289706;

	@Test
	public void callPatientSchedule() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		ScheduleDto dto = con.ejecutar("PUT", "/secure/healthCenter/22/callPatientSchedule/" + idSchedule,
				ScheduleDto.class);
		assert dto != null;
	}

	@Test
	public void cancelSchedule() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		ScheduleDto dto = con.ejecutar("PUT", "/secure/healthCenter/22/cancelSchedule/" + idSchedule,
				ScheduleDto.class);
		assert dto != null;
	}
}
