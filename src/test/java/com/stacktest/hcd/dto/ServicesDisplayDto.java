package com.stacktest.hcd.dto;

import java.util.List;

public class ServicesDisplayDto {
	private int id;
	private String name;
	private String details;
	private String status;
	private Integer healthCenter;
	private String ubication;
	private List<ServicesDto> services;
	private String uuid;

	public ServicesDisplayDto(int id, String name, String details, String status, Integer healthCenter,String ubication,String uuid) {
		this.id = id;
		this.name = name;
		this.details = details;
		this.status = status;
		this.healthCenter = healthCenter;
		this.ubication=ubication;
		this.uuid=uuid;
	}
	public ServicesDisplayDto() {

	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getHealthCenter() {
		return healthCenter;
	}

	public void setHealthCenter(Integer healthCenter) {
		this.healthCenter = healthCenter;
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
}

