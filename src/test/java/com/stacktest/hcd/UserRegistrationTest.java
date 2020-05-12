package com.stacktest.hcd;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.junit.Test;

import com.stacktest.hcd.dto.HealthCenterDto;
import com.stacktest.hcd.dto.HealthCenterServiceDto;
import com.stacktest.hcd.dto.PersonV1Dto;
import com.stacktest.hcd.dto.PhoneDto;
import com.stacktest.hcd.dto.ProfessionalV1Dto;
import com.stacktest.hcd.dto.ServiceDetailV1Dto;
import com.stacktest.hcd.dto.ServiceDto;
import com.stacktest.hcd.dto.SpecialtyDto;

public class UserRegistrationTest {
	HCDConnection con = new HCDConnection("32811727M", "1234");// Domene
	private String nationalCode = "50740562380338";
	private String docNumber = "30000000";
	private String gender = "F";
	private String phoneArea = "266";
	private String phoneNumber = "4320480";
	private String email = "dpacheco@stacktrace.com.ar";
	private int healthCenterId = 27;
	private int serviceId = 4182;

	@Test
	public void registerUser() {
		// 27402467 dos profesiones
		ProfessionalV1Dto dto = new ProfessionalV1Dto();
		dto.setRegistrationNumber(String.valueOf(new Random().nextInt(999999)));
		dto.setPerson(new PersonV1Dto());
		
		dto.getPerson().setDocNumber(docNumber);
		dto.getPerson().setSex(gender);
		dto.getPerson().setPhoneMobile(new PhoneDto());
		dto.getPerson().getPhoneMobile().setAreaCode(phoneArea);
		dto.getPerson().getPhoneMobile().setNumber(phoneNumber);
		dto.getPerson().setEmail(email);

		con.setMensajePost(dto);
		PersonV1Dto res = con.ejecutar("POST", "/token/register/user", PersonV1Dto.class);
		assert res != null;
	}

	@Test
	public void validateHealtCenter() {
		// 50740562380338 52740352380626 52740562380647 52740562380585
		Object res = con.ejecutar("GET", "/secure/autogestioned/validateHealthCenter/" + nationalCode, Object.class);
		assert res != null;
	}

	@Test
	public void getPublicHealthCenters() {
		Object res = con.ejecutar("GET", "/secure/autogestioned/healthCenter/public", Object.class);
		assert res != null;
	}

	@Test
	public void getSpecialities() {
		Object res = con.ejecutar("GET", "/secure/autogestioned/specialty/search/" + "uuu", Object.class);
		assert res != null;
	}

	@Test
	public void createService() {
		con = new HCDConnection(docNumber + gender, "1234");
		
		HealthCenterServiceDto dto = new HealthCenterServiceDto();
		dto.setHealthCenter(new HealthCenterDto());
		dto.getHealthCenter().setId(healthCenterId);
		
		dto.setService(new ServiceDetailV1Dto());
		dto.getService().setName("Servicio de Alcoholismo [" + new SimpleDateFormat("dd-MM-yy_HH-mm").format(new Date()) + "]");
		SpecialtyDto spDto = new SpecialtyDto();
		spDto.setId(7);
		dto.getService().setSpecialty(Arrays.asList(spDto));

		con.setMensajePost(dto);
		dto = con.ejecutar("POST", "/secure/autogestioned/professionalService", HealthCenterServiceDto.class);
		assert dto != null;
	}

	@Test
	public void deleteService() {
		con = new HCDConnection(docNumber + gender, "1234");
		
		ServiceDto res = con.ejecutar("DELETE", "/secure/autogestioned/professionalService/" + serviceId
				 , ServiceDto.class);
		assert res != null;
	}
}
