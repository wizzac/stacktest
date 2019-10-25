package com.stacktest.hcd;

import org.junit.Test;

import com.stacktest.hcd.dto.PersonTriageDto;
import com.stacktest.hcd.dto.PersonTriageTypeDto;

public class PatientTriageTest {
	private int idConsultation = 259;

	@Test
	public void createPatientTriage() {
		HCDConnection con = new HCDConnection("1M", "1234");

		PersonTriageDto dto = new PersonTriageDto();
		dto.setLevel(2);
		dto.setObservation("Observacion de TEST");

		con.setMensajePost(dto);
		PersonTriageDto resp = con.ejecutar("POST",
				"/secure/healthCenter/22/consultation/" + idConsultation + "/patienttriage", PersonTriageDto.class);
		
		assert resp != null;
	}

	@Test
	public void updatePatientTriage() {
		HCDConnection con = new HCDConnection("1M", "1234");

		PersonTriageDto dto = new PersonTriageDto();
		dto.setId(1);
		dto.setLevel(3);
		dto.setObservation("Observacion actualizada de TEST");

		con.setMensajePost(dto);
		PersonTriageDto resp = con.ejecutar("PUT",
				"/secure/healthCenter/22/consultation/" + idConsultation + "/patienttriage", PersonTriageDto.class);
		
		assert resp != null;
	}

	@Test
	public void getPatientTriageTypes() {
		HCDConnection con = new HCDConnection("1M", "1234");

		PersonTriageTypeDto[] resp = con.ejecutar("GET",
				"/secure/healthCenter/22/patienttriage/types", PersonTriageTypeDto[].class);
		
		assert resp != null;
	}
}