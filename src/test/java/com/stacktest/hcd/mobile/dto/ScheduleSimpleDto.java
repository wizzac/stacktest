package com.stacktest.hcd.mobile.dto;

public class ScheduleSimpleDto extends ScheduleBaseDto {
	private ServiceMinDto service;
	private ProfessionalMinDto professional;
	private boolean hasServicesDisplay;
	
	public ServiceMinDto getService() {
		return service;
	}

	public void setService(ServiceMinDto service) {
		this.service = service;
	}

	public ProfessionalMinDto getProfessional() {
		return professional;
	}

	public void setProfessional(ProfessionalMinDto professional) {
		this.professional = professional;
	}

	public boolean isHasServicesDisplay() {
		return hasServicesDisplay;
	}

	public void setHasServicesDisplay(boolean hasServicesDisplay) {
		this.hasServicesDisplay = hasServicesDisplay;
	}
}
