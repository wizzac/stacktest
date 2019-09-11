package com.stacktest.hcd;

import java.util.Random;

import org.junit.Test;

import com.google.gson.Gson;
import com.stacktest.hcd.dto.HealthCenterDto;
import com.stacktest.hcd.dto.ServicesDisplayDto;

public class ServicesDisplayTest {
	@Test
	public void getServicesDisplay() {
		HCDConnection con = new HCDConnection("1M", "1234");
		ServicesDisplayDto dto = con.ejecutar("GET", "/secure/healthCenter/22/servicesDisplay/1",
				ServicesDisplayDto.class);
		assert dto != null;
	}

	@Test
	public void updateServicesDisplay() {
		HCDConnection con = new HCDConnection("1M", "1234");
		ServicesDisplayDto dto = con.ejecutar("GET", "/secure/healthCenter/22/servicesDisplay/2",
				ServicesDisplayDto.class);
		assert dto != null;
		
		dto.setDetails(dto.getDetails() + "[Test Update]");
		con.setMensajePost(new Gson().toJson(dto));

		dto = con.ejecutar("PUT", "/secure/healthCenter/22/servicesDisplay/1", ServicesDisplayDto.class);
		assert dto != null;
	}
	
	@Test
	public void createServicesDisplay() {
		HCDConnection con = new HCDConnection("1M", "1234");
		
		ServicesDisplayDto dto = new ServicesDisplayDto();
		dto.setDetails("[Display creado por TEST]");
		dto.setName("[Display TEST " + new Random().nextInt(9999) + "]");
		dto.setStatus("ACT");

		HealthCenterDto hcDto = new HealthCenterDto();
		hcDto.setId(22);
		
		dto.setHealthCenter(hcDto);
		
		con.setMensajePost(new Gson().toJson(dto));
		dto = con.ejecutar("POST", "/secure/healthCenter/22/servicesDisplay", ServicesDisplayDto.class);
	}
	
	@Test
	public void deleteServicesDisplay() {
		HCDConnection con = new HCDConnection("1M", "1234");
		ServicesDisplayDto dto = con.ejecutar("DELETE", "/secure/healthCenter/22/servicesDisplay/2",
				ServicesDisplayDto.class);
		assert dto != null;
	}
	
	@Test
	public void findAllServicesDisplay() {
		HCDConnection con = new HCDConnection("1M", "1234");
		ServicesDisplayDto[] dtos = con.ejecutar("GET", "/secure/healthCenter/22/servicesDisplay",
				ServicesDisplayDto[].class);
		assert dtos != null;
	}
}
