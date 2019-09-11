package com.stacktest.hcd.dto;

import java.util.List;

public class ServiceDto {
	private int id;
	private String name;
	private String location;
	private List<SpecialityDto> specialities;
	private List<ProfessionalDto> professionals;
	private List<ScheduleDto> schedules;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<SpecialityDto> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(List<SpecialityDto> specialities) {
		this.specialities = specialities;
	}

	public List<ProfessionalDto> getProfessionals() {
		return professionals;
	}

	public void setProfessionals(List<ProfessionalDto> professionals) {
		this.professionals = professionals;
	}

	public List<ScheduleDto> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<ScheduleDto> schedules) {
		this.schedules = schedules;
	}
}
