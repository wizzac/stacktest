package com.stacktest.hcd;

import org.junit.Test;

public class ConsultationTest {
	private int idSchedule = 2313;
	private int idConsultation = 259;

	@Test
	public void getConsultationV1() {
		HCDConnection con = new HCDConnection("1M", "1234");
		Object resp = con.ejecutar("GET", "/secure/healthCenter/22/v1/consultation/" + idConsultation, Object.class);
		assert resp != null;
	}
	
	@Test
	public void getBaseSchedule() {
		HCDConnection con = new HCDConnection("1M", "1234");
		Object resp = con.ejecutar("GET", "/secure/healthCenter/22/schedule/get/" + idSchedule, Object.class);
		assert resp != null;
	}

	@Test
	public void createConsultation() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		Object resp = con.ejecutar("POST", "/secure/healthCenter/22/consultation/" + idSchedule, Object.class);
		assert resp != null;
	}

	@Test
	public void createConsultationMobile() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		Object resp = con.ejecutar("POST", "/secure/healthCenter/22/consultation/" + idSchedule, Object.class);
		assert resp != null;
	}

	@Test
	public void cancelConsultation() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		Object resp = con.ejecutar("PUT", "/secure/healthCenter/22/cancelconsultation/" + idConsultation, Object.class);
		assert resp != null;
	}
}
