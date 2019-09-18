package com.stacktest.hcd.mobile;

import org.junit.Test;

import com.stacktest.hcd.HCDConnection;
import com.stacktest.hcd.mobile.dto.ScheduleSimpleDto;

public class ScheduleTest {
	public int serviceId = 2720;
	@Test
	public void getPendingSchedules() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		con.agregarParametroGet("serviceId", String.valueOf(serviceId));
		con.agregarParametroGet("overSchedule", String.valueOf(1));
		ScheduleSimpleDto[] dtos = con.ejecutar("GET", "/secure/healthCenter/22/mobile/schedule/pending/person",
				ScheduleSimpleDto[].class);
		assert dtos != null;
	}
	
	@Test
	public void getPendingSchedules104() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		con.setHost("http://192.168.0.104:8080/saludServer");
		con.agregarParametroGet("personId", String.valueOf(557));
		con.agregarParametroGet("serviceId", String.valueOf(serviceId));
		con.agregarParametroGet("overSchedule", String.valueOf(1));
		ScheduleSimpleDto[] dtos = con.ejecutar("GET", "/secure/healthCenter/22/mobile/schedule/pending/person",
				ScheduleSimpleDto[].class);
		assert dtos != null;
	}
}
