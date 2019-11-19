package com.stacktest.hcd;

import org.junit.Test;

public class TerminologiaWSTest {
	String diagnosisSearch = "hta";
	String medicineSearch = "KETOROLAC";
	String studySearch = "URINARIO";
	Integer consultationId = 93412;

	@Test
	public void getDiagnosisNomenclatureDtos() {
		HCDConnection con = new HCDConnection("1M", "1234");

		con.agregarParametroGet("search", diagnosisSearch);
		if (consultationId != null)
			con.agregarParametroGet("consultationId", consultationId);

		Object dto = con.ejecutar("GET", "/secure/healthCenter/23/diagnosisNomenclature", Object.class);
		assert dto != null;
	}

	@Test
	public void getMedicineCommercialDtos() {
		HCDConnection con = new HCDConnection("1M", "1234");

		con.agregarParametroGet("search", medicineSearch);
		if (consultationId != null)
			con.agregarParametroGet("consultationId", consultationId);

		Object dto = con.ejecutar("GET", "/secure/healthCenter/23/vademecum/commercial", Object.class);
		assert dto != null;
	}

	@Test
	public void getMedicineGenericDtos() {
		HCDConnection con = new HCDConnection("1M", "1234");

		con.agregarParametroGet("search", medicineSearch);
		if (consultationId != null)
			con.agregarParametroGet("consultationId", consultationId);

		Object dto = con.ejecutar("GET", "/secure/healthCenter/23/vademecum/generic", Object.class);
		assert dto != null;
	}

	@Test
	public void getComplementaryStudyDtos() {
		HCDConnection con = new HCDConnection("1M", "1234");

		con.agregarParametroGet("search", studySearch);
		if (consultationId != null)
			con.agregarParametroGet("consultationId", consultationId);

		Object dto = con.ejecutar("GET", "/secure/healthCenter/23/complementaryStudies", Object.class);
		assert dto != null;
	}
}
