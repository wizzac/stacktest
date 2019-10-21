package com.stacktest.hcd;

import java.util.Date;

import org.junit.Test;

import com.stacktest.hcd.dto.ConsultationDto;
import com.stacktest.hcd.dto.HealthCenterDto;
import com.stacktest.hcd.dto.LookupValueDto;
import com.stacktest.hcd.dto.PersonBaseDto;
import com.stacktest.hcd.dto.PersonMedicationTreatmentDto;

public class PersonMedicineTreatmentTest {
	int patientId = 449;
	int consultationId = 259;
	int prescriptionId = 1431;
	int personHasMedTreatId = 1;

	@Test
	public void getPersonMedicineTreatmentsByPersonId() {
		HCDConnection con = new HCDConnection("1M", "1234");
		PersonMedicationTreatmentDto[] dto = con.ejecutar("GET", "/secure/medicinetreatment/person/" + patientId,
				PersonMedicationTreatmentDto[].class);

		assert dto != null;
	}

	@Test
	public void getPersonMedicineTreatmentsByConsultationId() {
		HCDConnection con = new HCDConnection("1M", "1234");
		PersonMedicationTreatmentDto[] dto = con.ejecutar("GET",
				"/secure/medicinetreatment/consultation/" + consultationId, PersonMedicationTreatmentDto[].class);

		assert dto != null;
	}

	@Test
	public void createPersonMedicineTreatment() {
		HCDConnection con = new HCDConnection("32811727M", "1234");

		PersonMedicationTreatmentDto dto = new PersonMedicationTreatmentDto();

		dto.setBrand("Marca medicamento 3");
		dto.setLot("Lote medicamento 3");
		dto.setDateSupply(new Date());
		dto.setExternalMedicationCode("0000000000000000000000002");
		dto.setIndications("Unas indicaciones actualizadas 3");
		dto.setObservations("Unas Observaciones Actualizadas 3");

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
		dto = con.ejecutar("POST", "/secure/medicinetreatment/", PersonMedicationTreatmentDto.class);

		assert dto != null;
	}
}