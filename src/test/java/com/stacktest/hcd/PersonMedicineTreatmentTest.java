package com.stacktest.hcd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.springframework.hateoas.PagedResources;

import com.stacktest.hcd.dto.LookupValueDto;
import com.stacktest.hcd.dto.PersonMedicationTreatmentDto;
import com.stacktest.hcd.dto.PrescriptionDto;

public class PersonMedicineTreatmentTest {
	private HCDConnection con = new HCDConnection("32811727M", "1234");// Domene
	private int idHealthCenter = 23;// Domene
	int idPatient = 9;//99575;
	int idconsultation = 192034;
	int idPrescription = 80410;
	int idPersonHasMedTreat = 15;
	
	@Test
	public void getPersonMedicineTreatmentsByPersonId() {
		//con.agregarParametroGet("code_med_treat_type", "DRUG_PER_OS");
		con.agregarParametroGet("active_principle", "AMOX");
		//con.agregarParametroGet("date_from", "2020-01-22");
		//con.agregarParametroGet("date_to", "2020-01-22");
		
		PagedResources<PersonMedicationTreatmentDto> page = con.ejecutarForPagedResources("GET",
				"/secure/healthCenter/" + idHealthCenter + "/patient/" + idPatient + "/medicationtreatment/page",
				PersonMedicationTreatmentDto.class);

		assert page != null;
	}

	@Test
	public void getPersonMedicineTreatmentsByConsultationId() {
		PersonMedicationTreatmentDto[] dto = con.ejecutar("GET",
				"/secure/healthCenter/" + idHealthCenter + "/consultation/" + idconsultation + "/medicationtreatment",
				PersonMedicationTreatmentDto[].class);

		assert dto != null;
	}

	@Test
	public void getPersonMedicineTreatmentsByPrescriptionId() {
		PersonMedicationTreatmentDto[] dto = con.ejecutar("GET",
				"/secure/healthCenter/" + idHealthCenter + "/prescription/" + idPrescription + "/medicationtreatment",
				PersonMedicationTreatmentDto[].class);

		assert dto != null;
	}
	
	@Test
	public void getPersonMedicineTreatmentsTypes() {
		Object[] dto = con.ejecutar("GET",
				"/secure/mobile/healthCenter/" + idHealthCenter + "/medicationtreatment/types", Object[].class);

		assert dto != null;
	}

	@Test
	public void createPersonMedicineTreatment() throws ParseException {
		PersonMedicationTreatmentDto dto = new PersonMedicationTreatmentDto();

		dto.setBrand(null);
		dto.setLot(null);
		dto.setDateSupply(new Date());
		dto.setMedicationCode("35953031000999113");
		dto.setMedicationDesc("KETOROLAC FABRA 30MG INY. X 1");
		dto.setIndications("Indicado por TEST");
		dto.setObservations("Generado por TEST");
		dto.setLastDose(false);

		dto.setMedicationTreatmentType(new LookupValueDto());
		dto.getMedicationTreatmentType().setCode("DRUG_INJECTION_INTRAVENOUS");
		//dto.setBrand("Una marca");
		//dto.setLot("Un lote");

		con.setMensajePost(dto);
		PersonMedicationTreatmentDto[] dtos = con.ejecutar("POST",
				"/secure/healthCenter/" + idHealthCenter + "/consultation/" + idconsultation + "/medicationtreatment",
				PersonMedicationTreatmentDto[].class);

		assert dtos != null;
	}

	@Test
	public void createPersonMedicineTreatmentWithPrescription() throws ParseException {
		PersonMedicationTreatmentDto dto = new PersonMedicationTreatmentDto();

		dto.setBrand(null);
		dto.setLot(null);
		dto.setDateSupply(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2020-01-22 09:05:00"));
		dto.setMedicationCode("14013361000999111");
		dto.setMedicationDesc("IBUPROFENO 400 MG CAPSULA");
		dto.setIndications("Indicado por TEST");
		dto.setObservations("Generado por TEST");
		dto.setLastDose(false);

		dto.setMedicationTreatmentType(new LookupValueDto());
		dto.getMedicationTreatmentType().setCode("DRUG_PER_OS");
		dto.getMedicationTreatmentType().setName("Medicación oral");

		dto.setPrescription(new PrescriptionDto());
		dto.getPrescription().setId(idPrescription);

		con.setMensajePost(dto);
		PersonMedicationTreatmentDto[] res = con.ejecutar("POST",
				"/secure/healthCenter/" + idHealthCenter + "/consultation/" + idconsultation + "/medicationtreatment",
				PersonMedicationTreatmentDto[].class);

		assert res != null;
	}

	@Test
	public void deletePersonMedicineTreatment() {
		PersonMedicationTreatmentDto dto = con.ejecutar("DELETE", "/secure/healthCenter/" + idHealthCenter
				+ "/consultation/" + idconsultation + "/medicationtreatment/" + idPersonHasMedTreat,
				PersonMedicationTreatmentDto.class);

		assert dto != null;
	}
}