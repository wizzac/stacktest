package com.stacktest.hcd;

import org.junit.Test;

import com.stacktest.hcd.dto.DiagnosisDto;
import com.stacktest.hcd.dto.NomenclatureDto;

public class DiagnosisTest {
	HCDConnection con = new HCDConnection("32811727M", "1234");// Domene
	private int idHealthCenter = 23;// Domene
	private int idConsultation = 127045;

	public void setIdConsultation(int idConsultation) {
		this.idConsultation = idConsultation;
	}

	@Test
	public void createDiagnosis() {
		DiagnosisDto dto = new DiagnosisDto();
		dto.setDiagnosisType("DEF");
		dto.setDiagnosisNomenclature(
				new NomenclatureDto(null, "568181000999115", null, "HOMOSEXUALIDAD", "WS_HOSPITAL_ITALIANO"));

		con.setMensajePost(dto);
		DiagnosisDto[] res = con.ejecutar("POST",
				"/secure/healthCenter/" + idHealthCenter + "/consultation/" + idConsultation + "/diagnosis",
				DiagnosisDto[].class);
		assert res != null;
	}
}
