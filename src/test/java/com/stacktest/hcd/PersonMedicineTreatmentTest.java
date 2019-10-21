package com.stacktest.hcd;

import java.util.Date;

import org.junit.Test;

import com.stacktest.hcd.dto.ConsultationDto;
import com.stacktest.hcd.dto.HealthCenterDto;
import com.stacktest.hcd.dto.LookupValueDto;
import com.stacktest.hcd.dto.PersonBaseDto;
import com.stacktest.hcd.dto.PersonMedicationTreatmentDto;
import com.stacktest.hcd.dto.PrescriptionDto;

public class PersonMedicineTreatmentTest {
	int patientId = 449;
	int consultationId = 259;
	int prescriptionId = 1431;
	int personHasMedTreatId = 1;

	@Test
	public void getLastActivePrescriptionsPatient() {
		HCDConnection con = new HCDConnection("1M", "1234");
		PrescriptionDto[] dto = con.ejecutar("GET",
				"/secure/prescription/active/patient/" + patientId, PrescriptionDto[].class);
		assert dto != null;
	}

	@Test
	public void getPersonMedicineTreatmentsByPersonId() {
		HCDConnection con = new HCDConnection("1M", "1234");
		PersonMedicationTreatmentDto[] dto = con.ejecutar("GET", "/secure/medicinetreatment/person/" + patientId,
				PersonMedicationTreatmentDto[].class);

		assert dto != null;
	}

	@Test
	public void createPersonMedicineTreatment() {
		HCDConnection con = new HCDConnection("32811727M", "1234");
		
		PersonMedicationTreatmentDto dto = new PersonMedicationTreatmentDto();
		
		dto.setBrand("Marca medicamento 2");
		dto.setLot("Lote medicamento 2");
		dto.setDateSupply(new Date());
		dto.setExternalMedicationCode("0000000000000000000000002");
		dto.setIndications("Unas indicaciones actualizadas 2");
		dto.setObservations("Unas Observaciones Actualizadas 2");
		
		dto.setMedicationTreatmentType(new LookupValueDto());
		dto.getMedicationTreatmentType().setCode("DRUG_PER_OS");
		
		dto.setConsultation(new ConsultationDto());
		dto.getConsultation().setId(consultationId);
		
		dto.setHealthCenter(new HealthCenterDto());
		dto.getHealthCenter().setId(22);
		
//		dto.setPrescription(new PrescriptionDto());
//		dto.getPrescription().setId(prescriptionId);
		
		dto.setPerson(new PersonBaseDto());
		dto.getPerson().setId(patientId);
		
		con.setMensajePost(dto);
		dto = con.ejecutar("POST", "/secure/medicinetreatment/",
				PersonMedicationTreatmentDto.class);

		assert dto != null;
	}
}