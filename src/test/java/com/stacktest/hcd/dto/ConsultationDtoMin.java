package com.stacktest.hcd.dto;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stacktest.hcd.config.ConstantConfig;

public class ConsultationDtoMin {

	private Integer consultationId;
	private Date consultationStartDate;
	private Date consultationEndDate;
	private Integer professionalId;
	private String professionalName;
	private String consultationReason;	
	private String serviceName;
	private String specialtyName;
	
	public Integer getConsultationId() {
		return consultationId;
	}
	public void setConsultationId(Integer consultationId) {
		this.consultationId = consultationId;
	}
	public String getConsultationReason() {
		return consultationReason;
	}
	public void setConsultationReason(String consultationReason) {
		this.consultationReason = consultationReason;
	}
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = ConstantConfig.SYSTEM_TIMEZONE)
	public Date getConsultationStartDate() {
		return consultationStartDate;
	}
	public void setConsultationStartDate(Date consultationStartDate) {
		this.consultationStartDate = consultationStartDate;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = ConstantConfig.SYSTEM_TIMEZONE)
	public Date getConsultationEndDate() {
		return consultationEndDate;
	}
	public void setConsultationEndDate(Date consultationEndDate) {
		this.consultationEndDate = consultationEndDate;
	}
	public Integer getProfessionalId() {
		return professionalId;
	}
	public void setProfessionalId(Integer professionalId) {
		this.professionalId = professionalId;
	}
	public String getProfessionalName() {
		return professionalName;
	}
	public void setProfessionalName(String professionalName) {
		this.professionalName = professionalName;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getSpecialtyName() {
		return specialtyName;
	}
	public void setSpecialtyName(String specialtyName) {
		this.specialtyName = specialtyName;
	}
	

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
	
}
