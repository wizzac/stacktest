package com.stacktest.hcd.dto.servicesDisplay;

import java.util.Date;

public class ScheduleDto {
	private int id;
	private String patient_name;
	private String professional_name;
	private String speciality;
	private Boolean show;
	private String location;
	private Date called_date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patient_name;
	}

	public void setPatientName(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getProfessionalName() {
		return professional_name;
	}

	public void setProfessionalName(String professional_name) {
		this.professional_name = professional_name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getCalledDate() {
		return called_date;
	}

	public void setCalledDate(Date called_date) {
		this.called_date = called_date;
	}
}
