package com.stacktest.hcd;

import java.util.Date;

import org.junit.Test;
import org.springframework.hateoas.PagedResources;

import com.stacktest.hcd.dto.LookupDto;
import com.stacktest.hcd.dto.PrescriptionDto;
import com.stacktest.hcd.dto.PrescriptionSuspensionDto;
import com.stacktest.hcd.dto.VademecumDto;

public class PrescriptionTest {
	private HCDConnection con = new HCDConnection("32811727M", "1234");// Domene
	private int idHealthCenter = 23;// Domene
	private int idPatient = 9;
	private int idPrescription = 79377;
	private int idConsultation = 128063;
	private String codeVademecum = "14013541000999116";
	private String descVademecum = "IBUPROFENO 600 MG CAPSULA";

	@Test
	public void createPrescription() {
		PrescriptionDto dto = new PrescriptionDto();
		dto.setAmount("15");
		dto.setPosology(new LookupDto());
		dto.getPosology().setId(2);
		dto.getPosology().setName("Miligramos");
		dto.getPosology().setCode("mg");
		dto.setDuration(15);
		dto.setFrecuency(15);
		dto.setRefill(1);
		dto.setRefillValue(2);
		dto.setRefillInterval(1);
		dto.setRefillMonthly(true);
		dto.setVademecum(new VademecumDto(null, codeVademecum, descVademecum));

		con.setMensajePost(dto);
		PrescriptionDto[] res = con.ejecutar("POST",
				"/secure/healthCenter/" + idHealthCenter + "/consultation/" + idConsultation + "/prescription",
				PrescriptionDto[].class);
		assert res != null;
		
		for (PrescriptionDto pDto : res) 
			if(dto.getVademecum().getCode().equals(codeVademecum))
				idPrescription = pDto.getId();				
		
		System.out.print("Id de la Prescripcion: " + idPrescription);
	}

	@Test
	public void getLastActiveMedicinePrescriptionsPatient() {
		PrescriptionDto[] dto = con.ejecutar("GET",
				"/secure/healthCenter/" + idHealthCenter + "/patient/" + idPatient + "/medicineprescriptions/active",
				PrescriptionDto[].class);
		assert dto != null;
	}

	@Test
		@SuppressWarnings("rawtypes")
	public void getMedicinePrescriptionsPatient() {
		con.agregarParametroGet("status", "SUS");
		//con.agregarParametroGet("active_principle", "keto");
		//con.agregarParametroGet("date_from", "2020-01-15");
		//con.agregarParametroGet("date_to", "2020-01-15");
		
		PagedResources page = con.ejecutar("GET",
				"/secure/healthCenter/" + idHealthCenter + "/patient/" + idPatient + "/medicineprescriptions",
				PagedResources.class);
		assert page != null;
	}

	@Test
	public void preSuspendPrescription() {
		PrescriptionSuspensionDto reqDto = new PrescriptionSuspensionDto();
		reqDto.setSuspensionDate(new Date());
		reqDto.setSuspensionReason("Se suspendió y punto viejo!!! TEST");

		con.setMensajePost(reqDto);

		PrescriptionDto dto = con.ejecutar("PUT", "/secure/healthCenter/" + idHealthCenter + "/consultation/"
				+ idConsultation + "/suspendprescription/" + idPrescription, PrescriptionDto.class);
		assert dto != null;
	}

	@Test
	public void preFinalizePrescription() {
		PrescriptionDto dto = con.ejecutar("PUT", "/secure/healthCenter/" + idHealthCenter + "/consultation/"
				+ idConsultation + "/finalizeprescription/" + idPrescription, PrescriptionDto.class);
		assert dto != null;
	}
}