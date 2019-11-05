package com.stacktest.hcd;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.stacktest.hcd.dto.LookupValueDto;
import com.stacktest.hcd.dto.PersonMedicationTreatmentDto;

public class PersonMedicineTreatmentTest {
	int patientId = 86751;
	int consultationId = 75100;
	int prescriptionId = 1431;
	int personHasMedTreatId = 15;

	@Test
	public void getPersonMedicineTreatmentsByPersonId() {
		HCDConnection con = new HCDConnection("1M", "1234");
		PersonMedicationTreatmentDto[] dto = con.ejecutar("GET", "/secure/healthCenter/22/patient/" + patientId + "/medicationtreatment",
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
	public void createPersonMedicineTreatment() throws ParseException {
		HCDConnection con = new HCDConnection("32811727M", "1234");

		PersonMedicationTreatmentDto dto = new PersonMedicationTreatmentDto();

		dto.setBrand(null);
		dto.setLot(null);
		dto.setDateSupply(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-10-31 19:10:00"));
		dto.setMedicationCode("35953031000999113");
		dto.setMedicationDesc("KETOROLAC FABRA 30MG INY. X 1");
		dto.setIndications(null);
		dto.setObservations(null);

		dto.setMedicationTreatmentType(new LookupValueDto());
		dto.getMedicationTreatmentType().setCode("DRUG_INJECTION_INTRAVENOUS");

		//dto.setPrescription(new PrescriptionDto());
		//dto.getPrescription().setId(prescriptionId);

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