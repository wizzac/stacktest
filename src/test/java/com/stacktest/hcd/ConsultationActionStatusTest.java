package com.stacktest.hcd;

import org.junit.Test;

public class ConsultationActionStatusTest {
	private int idSchedule = 290048;
	private int idConsultation = 0;

	@Test
	public void createConsultation() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		Object resp = con.ejecutar("POST", "/secure/healthCenter/22/consultation/" + idSchedule,
				Object.class);
		assert resp != null;
	}

	@Test
	public void createConsultationMobile() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		Object resp = con.ejecutar("POST", "/secure/healthCenter/22/consultation/" + idSchedule,
				Object.class);
		assert resp != null;
	}

	@Test
	public void cancelConsultation() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		Object resp = con.ejecutar("PUT", "/secure/healthCenter/22/cancelconsultation/" + idConsultation,
				Object.class);
		assert resp != null;
	}
}
