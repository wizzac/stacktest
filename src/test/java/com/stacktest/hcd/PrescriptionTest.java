package com.stacktest.hcd;

import java.util.Date;

import org.junit.Test;

import com.stacktest.hcd.dto.PrescriptionDto;
import com.stacktest.hcd.dto.PrescriptionSuspensionDto;

public class PrescriptionTest {
	int patientId = 557;
	int prescriptionId = 79222;

	@Test
	public void getLastActivePrescriptionsPatient() {
		HCDConnection con = new HCDConnection("1M", "1234");
		PrescriptionDto[] dto = con.ejecutar("GET", "/secure/healthCenter/22/patient/" + patientId + "/prescription",
				PrescriptionDto[].class);
		assert dto != null;
	}
	
	@Test
	public void getGenericByCommecialPatient() {
		HCDConnection con = new HCDConnection("1M", "1234");
		
		con.agregarParametroGet("code", "10124421000999114");
		con.agregarParametroGet("consultationId", "125776");
		//con.agregarParametroGet("internmentId", internmentId);
		Object dto = con.ejecutar("GET", "/secure/healthCenter/23/vademecum/genericBycommercial",
				Object.class);
		assert dto != null;
	}
	
	@Test
	public void suspendPrescription() {
		PrescriptionSuspensionDto reqDto = new PrescriptionSuspensionDto();
		reqDto.setSuspensionDate(new Date());
		reqDto.setSuspensionReason("Se suspendió y punto viejo!!!");

		HCDConnection con = new HCDConnection("1M", "1234");
		con.setMensajePost(con.getGsonBuilder().create().toJson(reqDto));
		
		Object dto = con.ejecutar("GET", "/secure/healthCenter/23/suspendprescription/" + prescriptionId,
				Object.class);
		assert dto != null;
	}
}
