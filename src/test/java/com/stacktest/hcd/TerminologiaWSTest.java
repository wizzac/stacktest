package com.stacktest.hcd;

import org.junit.Test;

public class TerminologiaWSTest {
	String diagnosisSearch = "torax";
	String medicineSearch = "KETOROLAC";
	String studySearch = "tórax";
	String genericMedicineCode = "7197571000999117";// KETOROLACO 10 MG COMPRIMIDO
	Integer consultationId = 126784;
	Integer internmentId =  null;//5;

	@Test
	public void getComplementaryStudyDtos() {
		HCDConnection con = new HCDConnection("1M", "1234");

		con.agregarParametroGet("search", studySearch);
		if (consultationId != null)
			con.agregarParametroGet("consultationId", consultationId);
		if (internmentId != null)
			con.agregarParametroGet("internmentId", internmentId);

		Object dto = con.ejecutar("GET", "/secure/healthCenter/23/complementaryStudies", Object.class);
		assert dto != null;
	}

	@Test
	public void getDiagnosisNomenclatureDtos() {
		HCDConnection con = new HCDConnection("32811727M", "1234");

		con.agregarParametroGet("search", diagnosisSearch);
		if (consultationId != null)
			con.agregarParametroGet("consultationId", consultationId);
		if (internmentId != null)
			con.agregarParametroGet("internmentId", internmentId);

		Object dto = con.ejecutar("GET", "/secure/healthCenter/23/diagnosisNomenclature", Object.class);
		assert dto != null;
	}

	@Test
	public void getMedicineCommercialByGenericDtos() {
		HCDConnection con = new HCDConnection("1M", "1234");

		con.agregarParametroGet("code", genericMedicineCode);
		if (consultationId != null)
			con.agregarParametroGet("consultationId", consultationId);
		if (internmentId != null)
			con.agregarParametroGet("internmentId", internmentId);

		Object dto = con.ejecutar("GET", "/secure/healthCenter/23/vademecum/commercialByGeneric", Object.class);
		assert dto != null;
	}

	@Test
	public void getMedicineCommercialDtos() {
		HCDConnection con = new HCDConnection("1M", "1234");

		con.agregarParametroGet("search", medicineSearch);
		if (consultationId != null)
			con.agregarParametroGet("consultationId", consultationId);
		if (internmentId != null)
			con.agregarParametroGet("internmentId", internmentId);

		Object dto = con.ejecutar("GET", "/secure/healthCenter/23/vademecum/commercial", Object.class);
		assert dto != null;
	}

	@Test
	public void getMedicineGenericDtos() {
		HCDConnection con = new HCDConnection("1M", "1234");

		con.agregarParametroGet("search", medicineSearch);
		if (consultationId != null)
			con.agregarParametroGet("consultationId", consultationId);
		if (internmentId != null)
			con.agregarParametroGet("internmentId", internmentId);

		Object dto = con.ejecutar("GET", "/secure/healthCenter/23/vademecum/generic", Object.class);
		assert dto != null;
	}
}
