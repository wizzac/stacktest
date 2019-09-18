package com.stacktest.hcd;

import org.junit.Test;
import org.springframework.http.ResponseEntity;

@SuppressWarnings("rawtypes")
public class ConsultationActionStatusTest {
	private int idSchedule = 290048;
	private int idConsultation = 0;

	@Test
	public void createConsultation() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		ResponseEntity resp = con.ejecutar("POST", "/secure/healthCenter/22/consultation/" + idSchedule,
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
