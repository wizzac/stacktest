package com.stacktest.hcd;

import org.junit.Test;

import com.stacktest.hcd.mobile.dto.ScheduleSimpleDto;

public class ScheduleTest {
	private int idScheduleAdmin = 295561;
	private int idScheduleCuk = 295561;
	private int idSchedulePacheco = 295580;
	private int idScheduleDomene = 302572;
	
	@Test
	public void callPatientScheduleForAdmin() {
		HCDConnection con = new HCDConnection("1M", "1234");
		ScheduleSimpleDto dto = con.ejecutar("PUT", "/secure/healthCenter/22/callPatientSchedule/" + idScheduleAdmin,
				ScheduleSimpleDto.class);
		assert dto != null;
	}

	@Test
	public void callPatientScheduleForCuk() {
		HCDConnection con = new HCDConnection("38830991M", "1234");
		ScheduleSimpleDto dto = con.ejecutar("PUT", "/secure/healthCenter/22/callPatientSchedule/" + idScheduleCuk,
				ScheduleSimpleDto.class);
		assert dto != null;
	}
	
	@Test
	public void callPatientScheduleForDomene() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		ScheduleSimpleDto dto = con.ejecutar("PUT", "/secure/healthCenter/15/callPatientSchedule/" + idScheduleDomene,
				ScheduleSimpleDto.class);
		assert dto != null;
	}
	
	@Test
	public void callPatientScheduleForPacheco() {
		HCDConnection con = new HCDConnection("34312958M", "1234");
		ScheduleSimpleDto dto = con.ejecutar("PUT", "/secure/healthCenter/22/callPatientSchedule/" + idSchedulePacheco,
				ScheduleSimpleDto.class);
		assert dto != null;
	}

	@Test
	public void cancelCallPatientScheduleForDomene() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		ScheduleSimpleDto dto = con.ejecutar("PUT", "/secure/healthCenter/22/cancelCallPatientSchedule/" + idScheduleDomene,
				ScheduleSimpleDto.class);
		assert dto != null;
	}

	@Test
	public void cancelSchedule() {
		HCDConnection con = new HCDConnection("38830991M", "1234");
		ScheduleSimpleDto dto = con.ejecutar("PUT", "/secure/healthCenter/22/cancelSchedule/" + idScheduleDomene,
				ScheduleSimpleDto.class);
		assert dto != null;
	}
}
