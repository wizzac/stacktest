package com.stacktest.hcd;

import java.util.Date;

import org.junit.Test;

import com.stacktest.hcd.dto.LookupValueDto;
import com.stacktest.hcd.dto.PersonBaseDto;
import com.stacktest.hcd.dto.PersonMedicationTreatmentDto;
import com.stacktest.hcd.dto.PrescriptionDto;

public class PersonMedicineTreatmentTest {
	int patientId = 449;
	int consultationId = 75069;
	int prescriptionId = 1431;
	int personHasMedTreatId = 4;

	@Test
	public void getPersonMedicineTreatmentsByPersonId() {
		HCDConnection con = new HCDConnection("1M", "1234");
		PersonMedicationTreatmentDto[] dto = con.ejecutar("GET", "/secure/mobile/healthCenter/22/patient/" + patientId + "/medicationtreatment",
				PersonMedicationTreatmentDto[].class);

		assert dto != null;
	}

	@Test
	public void getPersonMedicineTreatmentsByConsultationId() {
		HCDConnection con = new HCDConnection("1M", "1234");
		PersonMedicationTreatmentDto[] dto = con.ejecutar("GET",
				"/secure/healthCenter/22/consultation/" + consultationId + "/medicationtreatment", PersonMedicationTreatmentDto[].class);

		assert dto != null;
	}

	@Test
	public void getPersonMedicineTreatmentsTypes() {
		HCDConnection con = new HCDConnection("1M", "1234");
		Object[] dto = con.ejecutar("GET",
				"/secure/mobile/healthCenter/22/medicationtreatment/types", Object[].class);

		assert dto != null;
	}

	@Test
	public void createPersonMedicineTreatment() {
		HCDConnection con = new HCDConnection("32811727M", "1234");

		PersonMedicationTreatmentDto dto = new PersonMedicationTreatmentDto();

		dto.setBrand("Marca medicamento TEST");
		dto.setLot("Lote medicamento TEST");
		dto.setDateSupply(new Date());
		dto.setExternalMedicationCode("9934361000999111");
		dto.setExternalMedicationDesc("KETOROLAC FABRA 30MG INY. X 1");
		dto.setIndications("Unas indicaciones TEST");
		dto.setObservations("Unas Observaciones TEST");

		dto.setMedicationTreatmentType(new LookupValueDto());
		dto.getMedicationTreatmentType().setCode("DRUG_INJECTION_INTRAVENOUS");

		dto.setPrescription(new PrescriptionDto());
		dto.getPrescription().setId(prescriptionId);

		dto.setPerson(new PersonBaseDto());
		dto.getPerson().setId(patientId);

		con.setMensajePost(dto);
		dto = con.ejecutar("POST", "/secure/healthCenter/22/consultation/" + consultationId + "/medicationtreatment", PersonMedicationTreatmentDto.class);

		assert dto != null;
	}

	@Test
	public void deletePersonMedicineTreatment() {
		HCDConnection con = new HCDConnection("1M", "1234");
		PersonMedicationTreatmentDto dto = con.ejecutar("DELETE",
				"/secure/healthCenter/22/consultation/" + consultationId + "/medicationtreatment/" + personHasMedTreatId, PersonMedicationTreatmentDto.class);

		assert dto != null;
	}
}