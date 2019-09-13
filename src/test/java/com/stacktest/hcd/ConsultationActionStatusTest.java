package com.stacktest.hcd;

import org.junit.Test;
import org.springframework.http.ResponseEntity;

@SuppressWarnings("rawtypes")
public class ConsultationActionStatusTest {
	private int idSchedule = 289706;
	private int idConsultation = 68572;

	@Test
	public void createConsultation() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		ResponseEntity resp = con.ejecutar("POST", "/secure/healthCenter/22/consultation/" + idSchedule,
				ResponseEntity.class);
		assert resp != null;
	}

	@Test
	public void createConsultationFromMobile() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		ResponseEntity resp = con.ejecutar("POST", "/secure/healthCenter/22/mobile/consultation/" + idSchedule,
				ResponseEntity.class);
		assert resp != null;
	}

	@Test
	public void cancelConsultation() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		ResponseEntity resp = con.ejecutar("PUT", "/secure/healthCenter/22/cancelconsultation/" + idConsultation,
				ResponseEntity.class);
		assert resp != null;
	}
}
