package com.stacktest.hcd.mobile;

import org.junit.Test;
import org.springframework.http.ResponseEntity;

import com.stacktest.hcd.HCDConnection;

public class ConsultationTest {
	private int idSchedule = 0;
	
	@Test
	@SuppressWarnings("rawtypes")
	public void createConsultationFromMobile() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		ResponseEntity resp = con.ejecutar("POST", "/secure/healthCenter/22/mobile/consultation/" + idSchedule,
				ResponseEntity.class);
		assert resp != null;
	}
}
