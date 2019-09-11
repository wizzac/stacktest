package com.stacktest.hcd.dto;

public class ServicesHasDisplayDto {
	private int id;

	private ServiceDto service;

	private ServicesDisplayDto servicesDisplay;

	private String status;

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

	public ServicesDisplayDto getServicesDisplay() {
		return servicesDisplay;
	}

	public void setServicesDisplay(ServicesDisplayDto servicesDisplay) {
		this.servicesDisplay = servicesDisplay;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
