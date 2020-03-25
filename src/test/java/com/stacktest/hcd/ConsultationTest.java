package com.stacktest.hcd;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.tomcat.util.codec.binary.Base64;
import org.junit.Test;

import com.stacktest.hcd.dto.ConsultationDto;
import com.stacktest.hcd.dto.PersonDto;
import com.stacktest.hcd.dto.ProfessionalMinDto;
import com.stacktest.hcd.dto.ScheduleSimpleDto;
import com.stacktest.hcd.dto.ServiceMinDto;
import com.stacktest.hcd.dto.SignatureDto;

public class ConsultationTest {
	HCDConnection con = new HCDConnection("32811727M", "1234");// Domene
	private int idSchedule = 596049;
	private int idConsultation = 213081;
	private int idHealthCenter = 24;// Domene
	private int idService = 3125;// Domene
	private int idPersonProfessional = 557;// Domene
	private int idPatient = 55073;// 9 39797832 F PAULA VIRGINIA TORRES
	private String fileName = "4f3bf11f-2707-4a14-a4a8-134a4e8b7926";
	private String consultationFilePath = "C:/StackTest";

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	@Test
	public void getConsultation() {
		ConsultationDto resp = con.ejecutar("GET",
				"/secure/healthCenter/" + idHealthCenter + "/consultation/" + idConsultation, ConsultationDto.class);
		assert resp != null;
	}

	@Test
	public void getConsultationV1() {
		ConsultationDto resp = con.ejecutar("GET",
				"/secure/healthCenter/" + idHealthCenter + "/v1/consultation/" + idConsultation, ConsultationDto.class);
		assert resp != null;
	}

	@Test
	public void getBaseSchedule() {
		Object resp = con.ejecutar("GET", "/secure/healthCenter/" + idHealthCenter + "/schedule/get/" + idSchedule,
				Object.class);
		assert resp != null;
	}

	@Test
	public void createOverSchedule() {
		ScheduleSimpleDto dto = new ScheduleSimpleDto();
		dto.setOverSchedule(true);
		dto.setPerson(new PersonDto());
		dto.getPerson().setId(idPatient);
		dto.setProfessional(new ProfessionalMinDto());
		dto.getProfessional().setId(idPersonProfessional);
		dto.setService(new ServiceMinDto());
		dto.getService().setId(idService);
		dto.setScheduledDateFrom(new Date());
		dto.setScheduledDateTo(new Date());

		con.setMensajePost(dto);
		ScheduleSimpleDto res = con.ejecutar("POST",
				"/secure/healthCenter/" + idHealthCenter + "/schedule/overSchedule", ScheduleSimpleDto.class);
		assert res != null;

		idSchedule = res.getId();
	}

	@Test
	public void createConsultation() {
		ConsultationDto res = con.ejecutar("POST",
				"/secure/healthCenter/" + idHealthCenter + "/consultation/" + idSchedule, ConsultationDto.class);
		assert res != null;
		idConsultation = res.getId();
	}

	@Test
	public void cancelConsultation() {
		Object resp = con.ejecutar("PUT",
				"/secure/healthCenter/" + idHealthCenter + "/cancelconsultation/" + idConsultation, Object.class);
		assert resp != null;
	}

	@Test
	public void endConsultation() {
		ConsultationDto dto = new ConsultationDto();
		dto.setId(idConsultation);

		con.setMensajePost(dto);
		con.agregarParametroGet("newEndConsultation", "true");
		con.agregarParametroGet("saveToSign", "true");
		Object resp = con.ejecutar("PUT",
				"/secure/healthCenter/" + idHealthCenter + "/endconsultation/" + idConsultation, Object.class);
		assert resp != null;
	}

	@Test
	public void endDiagnosisEvolutionConsultation() {
		ConsultationDto dto = new ConsultationDto();
		dto.setId(idConsultation);

		con.setMensajePost(dto);
		con.agregarParametroGet("newEndConsultation", "true");
		con.agregarParametroGet("saveToSign", "true");
		Object resp = con.ejecutar("PUT",
				"/secure/healthCenter/" + idHealthCenter + "/endConsultation/" + idConsultation + "/diagnosisEvolution",
				Object.class);
		assert resp != null;
	}

	@Test
	@SuppressWarnings({ "unchecked", "resource" })
	public void createAndDownloadConsultationFile() {
		Map<String, String> resp = (Map<String, String>) con.ejecutar("GET",
				"/secure/files/download/pdf/consultation/" + idConsultation, HashMap.class);
		assert resp != null;

		byte[] data = Base64.decodeBase64(resp.get("document"));
		try {
			File fileDir = new File(consultationFilePath);
			if (!fileDir.exists())
				fileDir.mkdirs();

			File file = new File(consultationFilePath + "\\consultation_" + idConsultation + ".pdf");
			if (!file.exists())
				file.createNewFile();

			new FileOutputStream(file).write(data);
		} catch (Exception e) {
			e.printStackTrace();
			assert false;
		}
	}

	@Test
	@SuppressWarnings("resource")
	public void createAndDownloadConsultationFileFromFileName() {
		// no funciona porque no devuelve un json la llamada!!!!
		String resp = con.ejecutar("GET", "/secure/mobile/files/download/" + fileName, String.class);
		assert resp != null;

		byte[] data = Base64.decodeBase64(resp);
		try {
			File fileDir = new File(consultationFilePath);
			if (!fileDir.exists())
				fileDir.mkdirs();

			File file = new File(consultationFilePath + "\\consultation_" + idConsultation + ".pdf");
			if (!file.exists())
				file.createNewFile();

			new FileOutputStream(file).write(data);
		} catch (Exception e) {
			e.printStackTrace();
			assert false;
		}
	}

	@Test
	public void signConsultation() {
		SignatureDto dto = con.ejecutar("GET", "/secure/mobile/signature/hash/" + idConsultation, SignatureDto.class);
		assert dto != null;

		con.setMensajePost(dto);
		Object res = con.ejecutar("POST", "/secure/mobile/signature/sign", Object.class);
		assert res == null;
	}

	@Test
	public void createOverScheduleAndConsultation() {
		createOverSchedule();
		createConsultation();
		DiagnosisTest dt = new DiagnosisTest();
		dt.setIdConsultation(idConsultation);
		dt.createDiagnosis();

		System.out.print("Id de la Consulta: " + idConsultation);
	}

	@Test
	public void endAndSignConsultation() {
		endDiagnosisEvolutionConsultation();
		createAndDownloadConsultationFile();
		signConsultation();
	}
}