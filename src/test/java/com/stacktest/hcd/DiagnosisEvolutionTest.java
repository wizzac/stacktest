package com.stacktest.hcd;

import org.junit.Test;

public class DiagnosisEvolutionTest {
	HCDConnection con = new HCDConnection("32811727M", "1234");// Domene
	//HCDConnection con = new HCDConnection("33114838M", "1234");// Facu
	private int idHealthCenter = 23;// Domene
	private int idPatient = 121572;//557;//55073;//121571;
	private int idDiagnosisEvolution = 174;

	@Test
	public void getPatientDiagnosisEvolution() {
		Object res = con.ejecutar("GET", "/secure/healthCenter/" + idHealthCenter + "/patient/" + idPatient
				+ "/diagnosisEvolution/" + idDiagnosisEvolution, Object.class);
		assert res != null;
	}

	@Test
	public void searchPatientDiagnosisEvolution() {
		//con.agregarParametroGet("date_from", "2020-02-26");
		//con.agregarParametroGet("date_to", "2020-02-27");
		//con.agregarParametroGet("diagnosis", "EN LA");
		//con.agregarParametroGet("active", "true");
		
		Object[] res = con.ejecutar("GET",
				"/secure/healthCenter/" + idHealthCenter + "/patient/" + idPatient + "/diagnosisEvolution/search",
				Object[].class);
		assert res != null;
	}
}