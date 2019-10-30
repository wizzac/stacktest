package com.stacktest.hcd;

import org.junit.Test;

import com.stacktest.hcd.dto.PersonTriageDto;
import com.stacktest.hcd.dto.PersonTriageTypeDto;

public class PatientTriageTest {
	private int idConsultation = 75093;

	@Test
	public void createUpdatePatientTriage() {
		HCDConnection con = new HCDConnection("32811727M", "1234");

		PersonTriageDto dto = new PersonTriageDto();
		dto.setLevel(1);
		dto.setObservation("Observacion de TEST para la consulta " + idConsultation);

		con.setMensajePost(dto);
		PersonTriageDto resp = con.ejecutar("POST",
				"/secure/healthCenter/15/consultation/" + idConsultation + "/patienttriage", PersonTriageDto.class);

		assert resp != null;
	}

	@Test
	public void getPatientTriageTypes() {
		HCDConnection con = new HCDConnection("1M", "1234");

		PersonTriageTypeDto[] resp = con.ejecutar("GET", "/secure/healthCenter/22/patienttriage/types",
				PersonTriageTypeDto[].class);

		assert resp != null;
	}
}