package com.stacktest.hcd.dto;

public class ScheduleSimpleDto extends ScheduleBaseDto {
	private ServiceMinDto service;
	private ProfessionalMinDto professional;
	private boolean hasServicesDisplay;
	private boolean canCallPatient;
	private String message;
	private MessageOperatorDto messageOperator;
	
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

	public Boolean getCanCallPatient() {
		return canCallPatient;
	}

	public void setCanCallPatient(Boolean canCallPatient) {
		this.canCallPatient = canCallPatient;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageOperatorDto getMessageOperator() {
		return messageOperator;
	}

	public void setMessageOperator(MessageOperatorDto messageOperator) {
		this.messageOperator = messageOperator;
	}
}
