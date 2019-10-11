package com.stacktest.hcd.dto.servicesDisplay;

import java.util.List;

import com.stacktest.hcd.dto.HealthCenterDto;

public class ServicesDisplayEntityDto {
	private int id;
	private String name;
	private String details;
	private String status;
	private String ubication;
	private List<ServicesDto> services;
	private String uuid;
	private HealthCenterDto healthCenter;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

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

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getUbication() {
		return ubication;
	}

	public void setUbication(String ubication) {
		this.ubication = ubication;
	}

	public List<ServicesDto> getServices() {
		return services;
	}

	public void setServices(List<ServicesDto> services) {
		this.services = services;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public HealthCenterDto getHealthCenter() {
		return healthCenter;
	}

	public void setHealthCenter(HealthCenterDto healthCenter) {
		this.healthCenter = healthCenter;
	}
}
