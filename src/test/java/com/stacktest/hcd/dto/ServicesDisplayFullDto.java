package com.stacktest.hcd.dto;

import java.util.Date;
import java.util.List;

public class ServicesDisplayFullDto {
	private int id;
	private String name;
	private String details;
	private List<ServiceDto> services;
	private Date server_datetime;

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

	public List<ServiceDto> getServices() {
		return services;
	}

	public void setServices(List<ServiceDto> services) {
		this.services = services;
	}

	public Date getServer_datetime() {
		return server_datetime;
	}

	public void setServer_datetime(Date server_datetime) {
		this.server_datetime = server_datetime;
	}
}
