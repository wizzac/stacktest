package com.stacktest.hcd;

import org.junit.Test;

import com.stacktest.hcd.dto.PrescriptionDto;

public class PrescriptionTest {
	int patientId = 449;

	@Test
	public void getLastActivePrescriptionsPatient() {
		HCDConnection con = new HCDConnection("1M", "1234");
		PrescriptionDto[] dto = con.ejecutar("GET",
				"/secure/prescription/active/patient/" + patientId, PrescriptionDto[].class);
		assert dto != null;
	}
}
