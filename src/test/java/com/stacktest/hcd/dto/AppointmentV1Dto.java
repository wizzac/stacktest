package com.stacktest.hcd.dto;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stacktest.hcd.config.ConstantConfig;

public class AppointmentV1Dto {

	private Integer id;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = ConstantConfig.SYSTEM_TIMEZONE)
	private Date dateFrom;

	private DateFormatLabelV1Dto dateFromLabel;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = ConstantConfig.SYSTEM_TIMEZONE)
	private Date dateTo;

	private DateFormatLabelV1Dto dateToLabel;

	private String status;

	private String statusLabel;

	private String label;

	private String subLabel;

	private String labelColor;

	private String type;

	private boolean isDemand;

	private boolean isOverSchedule;

	private ServiceDto service;

	private String specialtiesNames;

	private String profesionalNames;

	private PersonV1Dto patient;

	private HealthCenterDto healthCenter;

	private boolean enabledToAssign;

	private boolean enabledToUnassign;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public DateFormatLabelV1Dto getDateFromLabel() {
		return dateFromLabel;
	}

	public void setDateFromLabel(DateFormatLabelV1Dto dateFromLabel) {
		this.dateFromLabel = dateFromLabel;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public DateFormatLabelV1Dto getDateToLabel() {
		return dateToLabel;
	}

	public void setDateToLabel(DateFormatLabelV1Dto dateToLabel) {
		this.dateToLabel = dateToLabel;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusLabel() {
		return statusLabel;
	}

	public void setStatusLabel(String statusLabel) {
		this.statusLabel = statusLabel;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ServiceDto getService() {
		return service;
	}

	public void setService(ServiceDto service) {
		this.service = service;
	}

	public PersonV1Dto getPatient() {
		return patient;
	}

	public void setPatient(PersonV1Dto patient) {
		this.patient = patient;
	}

	public String getProfesionalNames() {
		return profesionalNames;
	}

	public void setProfesionalNames(String profesionalNames) {
		this.profesionalNames = profesionalNames;
	}

	public boolean isDemand() {
		return isDemand;
	}

	public void setDemand(boolean isDemand) {
		this.isDemand = isDemand;
	}

	public boolean isOverSchedule() {
		return isOverSchedule;
	}

	public void setOverSchedule(boolean isOverSchedule) {
		this.isOverSchedule = isOverSchedule;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabelColor() {
		return labelColor;
	}

	public void setLabelColor(String labelColor) {
		this.labelColor = labelColor;
	}

	public String getSpecialtiesNames() {
		return specialtiesNames;
	}

	public void setSpecialtiesNames(String specialtiesNames) {
		this.specialtiesNames = specialtiesNames;
	}

	public HealthCenterDto getHealthCenter() {
		return healthCenter;
	}

	public void setHealthCenter(HealthCenterDto healthCenter) {
		this.healthCenter = healthCenter;
	}

	public String getSubLabel() {
		return subLabel;
	}

	public void setSubLabel(String subLabel) {
		this.subLabel = subLabel;
	}

	public boolean isEnabledToAssign() {
		return enabledToAssign;
	}

	public void setEnabledToAssign(boolean enabledToAssign) {
		this.enabledToAssign = enabledToAssign;
	}

	public boolean isEnabledToUnassign() {
		return enabledToUnassign;
	}

	public void setEnabledToUnassign(boolean enabledToUnassign) {
		this.enabledToUnassign = enabledToUnassign;
	}

	@JsonIgnore
	public LocalDate getLocalDateFrom() {
		Date day = (this.dateFrom != null) ? this.dateFrom : new Date();
		return day.toInstant().atZone(ZoneOffset.systemDefault()).toLocalDate();
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}

}
