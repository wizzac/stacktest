package com.stacktest.hcd;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.hateoas.PagedResources;

import com.google.gson.GsonBuilder;
import com.stacktest.hcd.dto.AppointmentV1Dto;
import com.stacktest.hcd.dto.HealthCenterDto;
import com.stacktest.hcd.dto.PersonV1Dto;
import com.stacktest.hcd.dto.ProfessionalDto;
import com.stacktest.hcd.dto.ServiceDto;
import com.stacktest.hcd.dto.ServiceHasProfesionalDto;

public class PlanificacionTest {
	public int idService = 2725;// 2722;
	public int professionalId = 2519;// 2520;
	public int appointment_id = 295554;// Actualizar al generar el planning
	public String date = "18/09/2019";
	public String timeStart = "19:00";
	public String timeEnd = "20:00";

	@Test
	public void createPlanning() {
		HCDConnection con = new HCDConnection("1M", "1234");

		ServiceHasProfesionalDto dto = new ServiceHasProfesionalDto();
		dto.setAllMonth(false);
		dto.setStatus("ACT");
		dto.setHourFrom(timeStart);
		dto.setHourTo(timeEnd);

		try {
			dto.setDateFrom(new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(date + " " + timeStart));
			dto.setDateTo(new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(date + " " + timeEnd));
		} catch (Exception e) {
			assert false;
		}

		ServiceDto servDto = new ServiceDto();
		servDto.setId(idService);
		dto.setService(servDto);

		ProfessionalDto proDto = new ProfessionalDto();
		proDto.setId(professionalId);
		dto.setProfessional(proDto);

		GsonBuilder gBuilder = new GsonBuilder();
		gBuilder.setDateFormat("dd-MM-yyyy HH:mm:ss");

		con.setMensajePost(gBuilder.create().toJson(dto));
		ServiceHasProfesionalDto[] resDto = con.ejecutar("POST", "/secure/healthCenter/22/planning?isValidate=1",
				ServiceHasProfesionalDto[].class);

		assert resDto != null;
	}

	@Test
	public void createAppointments() {
		HCDConnection con = new HCDConnection("1M", "1234");

		Date inicio = new Date();
		Date fin = new Date();

		try {
			inicio = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(String.format("%s %s", date, timeStart));
			fin = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(String.format("%s %s", date, timeEnd));
		} catch (Exception e) {
			assert false;
		}

		int minutes = 10 * 60 * 1000;// 10 min.
		List<AppointmentV1Dto> res = new ArrayList<>();

		// Los ids son consecutivos y están ACT
		int idPerson = 11;
		while (inicio.getTime() <= fin.getTime()) {
			Date finTurno = new Date(inicio.getTime() + minutes);

			AppointmentV1Dto dto = new AppointmentV1Dto();
			dto.setId(appointment_id);
			dto.setEnabledToAssign(true);
			dto.setStatus("ACT");
			dto.setType("PRO");
			dto.setOverSchedule(true);
			dto.setDateFrom(inicio);
			dto.setDateTo(finTurno);

			HealthCenterDto hcDto = new HealthCenterDto();
			hcDto.setId(22);
			dto.setHealthCenter(hcDto);

			ServiceDto servDto = new ServiceDto();
			servDto.setId(idService);
			dto.setService(servDto);

			PersonV1Dto patientDto = new PersonV1Dto();
			patientDto.setId(idPerson);
			dto.setPatient(patientDto);

			GsonBuilder gBuilder = new GsonBuilder();
			gBuilder.setDateFormat("dd-MM-yyyy HH:mm:ss");

			con.setMensajePost(gBuilder.create().toJson(dto));

			try {
				dto = con.ejecutar("POST", "/secure/healthCenter/22/service/" + idService + "/appointment",
						AppointmentV1Dto.class);
				res.add(dto);
			} catch (Exception e) {
				// no pudo deserealizar
			}
			inicio = finTurno;
			idPerson++;
		}

		assert res.size() > 0;
	}	

	@Test
	@SuppressWarnings("rawtypes")
	public void searchPlanning() {
		HCDConnection con = new HCDConnection("1M", "1234");
		PagedResources res = con.ejecutar("GET", "/secure/healthCenter/22/schedule/today?search=&page=0&size=20",
				PagedResources.class);
		
		assert res != null;
	}
}
