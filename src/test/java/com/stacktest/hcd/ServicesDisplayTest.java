package com.stacktest.hcd;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

import com.google.gson.Gson;
import com.stacktest.hcd.dto.servicesDisplay.ScheduleDto;
import com.stacktest.hcd.dto.servicesDisplay.ServicesDisplayDto;
import com.stacktest.hcd.dto.servicesDisplay.ServicesDisplayEntityDto;
import com.stacktest.hcd.dto.servicesDisplay.ServicesDto;

public class ServicesDisplayTest {
	public int displayId = 1;

	@Test
	public void getServicesDisplay() {
		HCDConnection con = new HCDConnection("1M", "1234");
		ServicesDisplayDto dto = con.ejecutar("GET", "/secure/healthCenter/22/servicesDisplay/" + displayId,
				ServicesDisplayDto.class);
		assert dto != null;
	}

	@Test
	public void updateServicesDisplay() {
		HCDConnection con = new HCDConnection("1M", "1234");
		ServicesDisplayDto dto = con.ejecutar("GET", "/secure/healthCenter/22/servicesDisplay/" + displayId,
				ServicesDisplayDto.class);
		assert dto != null;

		dto.setDetails(dto.getDetails() + "[Test Update]");
		con.setMensajePost(new Gson().toJson(dto));

		dto = con.ejecutar("PUT", "/secure/healthCenter/22/servicesDisplay/" + displayId, ServicesDisplayDto.class);
		assert dto != null;
	}

	@Test
	public void createServicesDisplay() {
		HCDConnection con = new HCDConnection("1M", "1234");

		ServicesDisplayEntityDto dto = new ServicesDisplayEntityDto();
		dto.setDetails("[Display creado por TEST]");
		dto.setName("[Display TEST " + new Random().nextInt(9999) + "]");
		dto.setStatus("ACT");

		con.setMensajePost(new Gson().toJson(dto));
		ServicesDisplayDto res = con.ejecutar("POST", "/secure/healthCenter/22/servicesDisplay", ServicesDisplayDto.class);
		assert res != null;
	}

	@Test
	public void createServicesDisplayDomene() {
		HCDConnection con = new HCDConnection("1M", "1234");

		ServicesDisplayEntityDto dto = new ServicesDisplayEntityDto();
		dto.setDetails("");
		dto.setName("Domene " + new Random().nextInt(9999));
		dto.setStatus("ACT");
		dto.setUbication("");
		dto.setServices(new ArrayList<>());
		dto.getServices().add(new ServicesDto());
		dto.getServices().get(0).setId(2783);
		
		for (int i = 0; i < 8764; i++) 
			dto.setUbication("x" + dto.getUbication());

		con.setMensajePost(new Gson().toJson(dto));
		ServicesDisplayDto res = con.ejecutar("POST", "/secure/healthCenter/22/servicesDisplay", ServicesDisplayDto.class);
		assert res != null;
	}

	@Test
	public void deleteServicesDisplay() {
		HCDConnection con = new HCDConnection("1M", "1234");
		ServicesDisplayDto dto = con.ejecutar("DELETE", "/secure/healthCenter/22/servicesDisplay/" + displayId,
				ServicesDisplayDto.class);
		assert dto != null;
	}

	@Test
	public void getAllServicesDisplay() {
		HCDConnection con = new HCDConnection("1M", "1234");
		ServicesDisplayDto[] dtos = con.ejecutar("GET", "/secure/healthCenter/22/servicesDisplay",
				ServicesDisplayDto[].class);
		assert dtos != null;
	}

	@Test
	public void getCalledSchedules() {
		HCDConnection con = new HCDConnection("1M", "1234");
		ScheduleDto[] dtos = con.ejecutar("GET", "/secure/healthCenter/22/servicesDisplay/" + displayId + "/calledSchedules/",
				ScheduleDto[].class);
		assert dtos != null;
	}

	@Test
	public void getAllCalledSchedules() {
		HCDConnection con = new HCDConnection("1M", "1234");
		ScheduleDto[] dtos = con.ejecutar("GET", "/secure/healthCenter/22/servicesDisplay/" + displayId + "/allCalledSchedules/",
				ScheduleDto[].class);
		assert dtos != null;
	}
}
