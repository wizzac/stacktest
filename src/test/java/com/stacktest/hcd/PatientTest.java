package com.stacktest.hcd;

import org.junit.Test;

public class PatientTest {
	private int patientId = 449;
	private int scheduleId = 1567;

	@Test
	public void getPatientResume() {
		HCDConnection con = new HCDConnection("1M", "1234");

		Object resp = con.ejecutar("GET", "/secure/healthCenter/23/patient/" + patientId,
				Object.class);

		assert resp != null;
	}

	@Test
	public void getSchedulePatientResume() {
		HCDConnection con = new HCDConnection("1M", "1234");

		Object resp = con.ejecutar("GET", "/secure/healthCenter/23/schedule/" + scheduleId + "/patient",
				Object.class);

		assert resp != null;
	}

	@Test
	public void getMedicinePrescriptionsPatient() {
		HCDConnection con = new HCDConnection("1M", "1234");

		Object resp = con.ejecutar("GET", "/secure/healthCenter/23/patient/9/medicinePrescriptions",
				Object.class);

		assert resp != null;
	}
}
