package com.stacktest.hcd.dto;

import java.util.Date;

public class ServiceHasProfesionalDto {
	private int id;
	private ServiceDto service;
	private ProfessionalDto professional;
	private String status;
	private Date dateFrom;
	private Date dateTo;
	private String hourFrom;
	private String hourTo;
	private boolean allMonth;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ServiceDto getService() {
		return service;
	}

	public void setService(ServiceDto service) {
		this.service = service;
	}

	public ProfessionalDto getProfessional() {
		return professional;
	}

	public void setProfessional(ProfessionalDto professional) {
		this.professional = professional;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getHourFrom() {
		return hourFrom;
	}

	public void setHourFrom(String hourFrom) {
		this.hourFrom = hourFrom;
	}

	public String getHourTo() {
		return hourTo;
	}

	public void setHourTo(String hourTo) {
		this.hourTo = hourTo;
	}

	public boolean isAllMonth() {
		return allMonth;
	}

	public void setAllMonth(boolean allMonth) {
		this.allMonth = allMonth;
	}
}
