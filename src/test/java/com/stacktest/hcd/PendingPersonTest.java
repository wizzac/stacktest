package com.stacktest.hcd;

import org.junit.Test;

import com.stacktest.hcd.mobile.dto.ScheduleSimpleDto;

public class PendingPersonTest {
	private int serviceId = 2783;
	private int personId = 557;
	private int overschedule = 1;

	@Test
	public void getPendingPerson() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		con.agregarParametroGet("serviceId", serviceId);
		con.agregarParametroGet("personId", personId);
		con.agregarParametroGet("overschedule", overschedule);
		ScheduleSimpleDto[] dtos = con.ejecutar("GET", "/secure/healthCenter/22/mobile/schedule/pending/person",
				ScheduleSimpleDto[].class);
		assert dtos != null;
	}

	@Test
	public void getAttendAppointments() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		Object dtos = con.ejecutar("GET", "/secure/healthCenter/22/appointment/attend", Object.class);
		assert dtos != null;
	}
}
