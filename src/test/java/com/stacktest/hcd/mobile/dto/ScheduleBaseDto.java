package com.stacktest.hcd.mobile.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stacktest.hcd.config.ConstantConfig;

public class ScheduleBaseDto {
	private int id;
	private long dateCreated;
	private long dateModified;
	private boolean telemedicine;
	private boolean overSchedule;
	private String scheduledType;
	private Date scheduledDateFrom;
	private Date scheduledDateTo;
	private String status;
	private Date arrivalTime;
	private PersonDto person;
	private String statusLabel;
	private String statusLabelColor;

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

	public boolean isTelemedicine() {
		return telemedicine;
	}

	public void setTelemedicine(boolean telemedicine) {
		this.telemedicine = telemedicine;
	}

	public boolean isOverSchedule() {
		return overSchedule;
	}

	public void setOverSchedule(boolean overSchedule) {
		this.overSchedule = overSchedule;
	}

	public String getScheduledType() {
		return scheduledType;
	}

	public void setScheduledType(String scheduledType) {
		this.scheduledType = scheduledType;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = ConstantConfig.SYSTEM_TIMEZONE)
	public Date getScheduledDateFrom() {
		return scheduledDateFrom;
	}

	public void setScheduledDateFrom(Date scheduledDateFrom) {
		this.scheduledDateFrom = scheduledDateFrom;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = ConstantConfig.SYSTEM_TIMEZONE)
	public Date getScheduledDateTo() {
		return scheduledDateTo;
	}

	public void setScheduledDateTo(Date scheduledDateTo) {
		this.scheduledDateTo = scheduledDateTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = ConstantConfig.SYSTEM_TIMEZONE)
	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public PersonDto getPerson() {
		return person;
	}

	public void setPerson(PersonDto person) {
		this.person = person;
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
}
