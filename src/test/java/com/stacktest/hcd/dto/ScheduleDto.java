package com.stacktest.hcd.dto;

import java.util.Date;

public class ScheduleDto {
	private int id;
	private String patient_first_name;
	private String patient_last_name;
	private int professional_id;
	private int service_id;
	private Date date_status;
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatient_first_name() {
		return patient_first_name;
	}

	public void setPatient_first_name(String patient_first_name) {
		this.patient_first_name = patient_first_name;
	}

	public String getPatient_last_name() {
		return patient_last_name;
	}

	public void setPatient_last_name(String patient_last_name) {
		this.patient_last_name = patient_last_name;
	}

	public int getProfessional_id() {
		return professional_id;
	}

	public void setProfessional_id(int professional_id) {
		this.professional_id = professional_id;
	}

	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	public Date getDate_status() {
		return date_status;
	}

	public void setDate_status(Date date_status) {
		this.date_status = date_status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
