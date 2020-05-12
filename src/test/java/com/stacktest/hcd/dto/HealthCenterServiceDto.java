package com.stacktest.hcd.dto;

public class HealthCenterServiceDto {
	private HealthCenterDto healthCenter;
	private ServiceDetailV1Dto service;

	public HealthCenterDto getHealthCenter() {
		return healthCenter;
	}

	public void setHealthCenter(HealthCenterDto healthCenter) {
		this.healthCenter = healthCenter;
	}

	public ServiceDetailV1Dto getService() {
		return service;
	}

	public void setService(ServiceDetailV1Dto service) {
		this.service = service;
	}
}
