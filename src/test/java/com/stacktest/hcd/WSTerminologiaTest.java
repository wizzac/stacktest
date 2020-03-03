package com.stacktest.hcd;

import org.junit.Test;

public class WSTerminologiaTest {
	private HCDConnection con = new HCDConnection("32811727M", "1234");// Domene
	private int idHealthCenter = 23;// Domene
	private Integer idConsultation = 128063;
	private Integer idInternment =  null;//5;
	String diagnosisSearch = "torax";
	String medicineSearch = "KETOROLAC";
	String studySearch = "tórax";
	String genericMedicineCode = "7197571000999117";// KETOROLACO 10 MG COMPRIMIDO

	@Test
	public void getComplementaryStudyDtos() {
		con.agregarParametroGet("search", studySearch);
		if (idConsultation != null)
			con.agregarParametroGet("consultationId", idConsultation);
		if (idInternment != null)
			con.agregarParametroGet("internmentId", idInternment);

		Object dto = con.ejecutar("GET", "/secure/healthCenter/" + idHealthCenter + "/complementaryStudies", Object.class);
		assert dto != null;
	}

	@Test
	public void getDiagnosisNomenclatureDtos() {
		con.agregarParametroGet("search", diagnosisSearch);
		if (idConsultation != null)
			con.agregarParametroGet("consultationId", idConsultation);
		if (idInternment != null)
			con.agregarParametroGet("internmentId", idInternment);

		Object dto = con.ejecutar("GET", "/secure/healthCenter/" + idHealthCenter + "/diagnosisNomenclature", Object.class);
		assert dto != null;
	}

	@Test
	public void getMedicineGenericByCommecialPatient() {
		con.agregarParametroGet("code", "10124421000999114");
		if (idConsultation != null)
			con.agregarParametroGet("consultationId", idConsultation);
		// con.agregarParametroGet("internmentId", internmentId);
		Object dto = con.ejecutar("GET", "/secure/healthCenter/" + idHealthCenter + "/vademecum/genericBycommercial",
				Object.class);
		assert dto != null;
	}

	@Test
	public void getMedicineCommercialByGenericDtos() {
		con.agregarParametroGet("code", genericMedicineCode);
		if (idConsultation != null)
			con.agregarParametroGet("consultationId", idConsultation);
		if (idInternment != null)
			con.agregarParametroGet("internmentId", idInternment);

		Object dto = con.ejecutar("GET", "/secure/healthCenter/" + idHealthCenter + "/vademecum/commercialByGeneric", Object.class);
		assert dto != null;
	}
	@Test
	
	public void getCodeSNMapping() {
		con.agregarParametroGet("code", "630471000999111");

		Object dto = con.ejecutar("GET", "/secure/healthCenter/" + idHealthCenter + "/codeSNMapping", Object.class);
		assert dto != null;
	}

	@Test
	public void getMedicineCommercialDtos() {
		con.agregarParametroGet("search", medicineSearch);
		if (idConsultation != null)
			con.agregarParametroGet("consultationId", idConsultation);
		if (idInternment != null)
			con.agregarParametroGet("internmentId", idInternment);

		Object dto = con.ejecutar("GET", "/secure/healthCenter/" + idHealthCenter + "/vademecum/commercial", Object.class);
		assert dto != null;
	}

	@Test
	public void getMedicineGenericDtos() {
		con.agregarParametroGet("search", medicineSearch);
		if (idConsultation != null)
			con.agregarParametroGet("consultationId", idConsultation);
		if (idInternment != null)
			con.agregarParametroGet("internmentId", idInternment);

		Object dto = con.ejecutar("GET", "/secure/healthCenter/" + idHealthCenter + "/vademecum/generic", Object.class);
		assert dto != null;
	}
}
