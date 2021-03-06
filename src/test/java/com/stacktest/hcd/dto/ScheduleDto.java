package com.stacktest.hcd.dto;

import java.util.Date;
import java.util.List;

import com.stacktest.hcd.dto.servicesDisplay.ServicesDisplayDto;

public class ScheduleDto {
	private int id;
	private long dateCreated;
	private long dateModified;
	private Boolean telemedicine;
	private Boolean overSchedule;
	private Boolean firstTime;
	private String scheduledType;
	private Date scheduledDateFrom;
	private Date scheduledDateTo;
	private Date calledDate;
	private Boolean canCallPatient;
	private String status;
	private Date arrivalTime;
	private List<ConsultationDto> consultations;
	// private OperatorDto createdBy;
	// private OperatorDto modifiedBy;
	private PersonDto person;
	private boolean freeSchedule;
	String statusLabel;
	private String statusLabelColor;
	// private SurgeryDto surgery;
	private ServiceDto service;
	private ProfessionalDto professional;
	// private ServiceHasProfessionaDtol planning;
	private ScheduleDto remoteSchedule;
	private Long countAssignedDemand;
	private Boolean takenToAssigned;
	private Date takenToAssignedDateLimit;
	// private OperatorDto takenToAssignedOperator;
	private List<ServicesDisplayDto> servicesDisplays;
	private MessageOperatorDto messageOperator;
	private String message;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(long dateCreated) {
		this.dateCreated = dateCreated;
	}

	public long getDateModified() {
		return dateModified;
	}

	public void setDateModified(long dateModified) {
		this.dateModified = dateModified;
	}

	public Boolean getTelemedicine() {
		return telemedicine;
	}

	public void setTelemedicine(Boolean telemedicine) {
		this.telemedicine = telemedicine;
	}

	public Boolean getOverSchedule() {
		return overSchedule;
	}

	public void setOverSchedule(Boolean overSchedule) {
		this.overSchedule = overSchedule;
	}

	public Boolean getFirstTime() {
		return firstTime;
	}

	public void setFirstTime(Boolean firstTime) {
		this.firstTime = firstTime;
	}

	public String getScheduledType() {
		return scheduledType;
	}

	public void setScheduledType(String scheduledType) {
		this.scheduledType = scheduledType;
	}

	public Date getScheduledDateFrom() {
		return scheduledDateFrom;
	}

	public void setScheduledDateFrom(Date scheduledDateFrom) {
		this.scheduledDateFrom = scheduledDateFrom;
	}

	public Date getScheduledDateTo() {
		return scheduledDateTo;
	}

	public void setScheduledDateTo(Date scheduledDateTo) {
		this.scheduledDateTo = scheduledDateTo;
	}

	public Date getCalledDate() {
		return calledDate;
	}

	public void setCalledDate(Date calledDate) {
		this.calledDate = calledDate;
	}

	public Boolean getCanCallPatient() {
		return canCallPatient;
	}

	public void setCanCallPatient(Boolean canCallPatient) {
		this.canCallPatient = canCallPatient;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public List<ConsultationDto> getConsultations() {
		return consultations;
	}

	public void setConsultations(List<ConsultationDto> consultations) {
		this.consultations = consultations;
	}

	public PersonDto getPerson() {
		return person;
	}

	public void setPerson(PersonDto person) {
		this.person = person;
	}

	public boolean isFreeSchedule() {
		return freeSchedule;
	}

	public void setFreeSchedule(boolean freeSchedule) {
		this.freeSchedule = freeSchedule;
	}

	public String getStatusLabel() {
		return statusLabel;
	}

	public void setStatusLabel(String statusLabel) {
		this.statusLabel = statusLabel;
	}

	public String getStatusLabelColor() {
		return statusLabelColor;
	}

	public void setStatusLabelColor(String statusLabelColor) {
		this.statusLabelColor = statusLabelColor;
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

	public ScheduleDto getRemoteSchedule() {
		return remoteSchedule;
	}

	public void setRemoteSchedule(ScheduleDto remoteSchedule) {
		this.remoteSchedule = remoteSchedule;
	}

	public Long getCountAssignedDemand() {
		return countAssignedDemand;
	}

	public void setCountAssignedDemand(Long countAssignedDemand) {
		this.countAssignedDemand = countAssignedDemand;
	}

	public Boolean getTakenToAssigned() {
		return takenToAssigned;
	}

	public void setTakenToAssigned(Boolean takenToAssigned) {
		this.takenToAssigned = takenToAssigned;
	}

	public Date getTakenToAssignedDateLimit() {
		return takenToAssignedDateLimit;
	}

	public void setTakenToAssignedDateLimit(Date takenToAssignedDateLimit) {
		this.takenToAssignedDateLimit = takenToAssignedDateLimit;
	}

	public List<ServicesDisplayDto> getServicesDisplays() {
		return servicesDisplays;
	}

	public void setServicesDisplays(List<ServicesDisplayDto> servicesDisplays) {
		this.servicesDisplays = servicesDisplays;
	}

	public MessageOperatorDto getMessageOperator() {
		return messageOperator;
	}

	public void setMessageWriter(MessageOperatorDto messageOperator) {
		this.messageOperator = messageOperator;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
