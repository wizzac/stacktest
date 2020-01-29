package com.stacktest.hcd.dto;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stacktest.hcd.config.ConstantConfig;

public class PrescriptionDto {

	private Integer id;

	private String status;

	private String statusLabel;

	private String amount;

	private String amountLabel;

	private LookupDto posology;

	private Integer duration;

	private Boolean durationMonthly;

	private Integer frecuency;

	private Integer refill;

	private Integer refillValue;

	private int refillInterval;

	private boolean refillMonthly;

	private boolean generatedByRefill;

	private VademecumDto vademecum;

	private String indication;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = ConstantConfig.SYSTEM_TIMEZONE)
	private Date date;

	private String professional;

	private int applications;

	private String closureReason;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = ConstantConfig.SYSTEM_TIMEZONE)
	private Date closureDate;

	private Integer closurePersonId;

	private String closurePersonDesc;

	private String closureStatus;
	
	private boolean canFinalizeSuspend;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Boolean getDurationMonthly() {
		return durationMonthly;
	}

	public void setDurationMonthly(Boolean durationMonthly) {
		this.durationMonthly = durationMonthly;
	}

	public Integer getFrecuency() {
		return frecuency;
	}

	public void setFrecuency(Integer frecuency) {
		this.frecuency = frecuency;
	}

	public Integer getRefill() {
		return refill;
	}

	public void setRefill(Integer refill) {
		this.refill = refill;
	}

	public Integer getRefillValue() {
		return refillValue;
	}

	public void setRefillValue(Integer refillValue) {
		this.refillValue = refillValue;
	}

	public int getRefillInterval() {
		return refillInterval;
	}

	public void setRefillInterval(int refillInterval) {
		this.refillInterval = refillInterval;
	}

	public boolean getRefillMonthly() {
		return refillMonthly;
	}

	public void setRefillMonthly(boolean refillMonthly) {
		this.refillMonthly = refillMonthly;
	}

	public boolean getGeneratedByRefill() {
		return generatedByRefill;
	}

	public void setGeneratedByRefill(boolean generatedByRefill) {
		this.generatedByRefill = generatedByRefill;
	}

	public VademecumDto getVademecum() {
		return vademecum;
	}

	public void setVademecum(VademecumDto vademecum) {
		this.vademecum = vademecum;
	}

	public LookupDto getPosology() {
		return posology;
	}

	public String getIndication() {
		return indication;
	}

	public void setIndication(String indication) {
		this.indication = indication;
	}

	public void setPosology(LookupDto posology) {
		this.posology = posology;
	}

	public String getAmountLabel() {
		return amountLabel;
	}

	public void setAmountLabel(String amountLabel) {
		this.amountLabel = amountLabel;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getProfessional() {
		return professional;
	}

	public void setProfessional(String professional) {
		this.professional = professional;
	}

	public int getApplications() {
		return applications;
	}

	public void setApplications(int applications) {
		this.applications = applications;
	}

	public String getClosureReason() {
		return closureReason;
	}

	public void setClosureReason(String closureReason) {
		this.closureReason = closureReason;
	}

	public Date getClosureDate() {
		return closureDate;
	}

	public void setClosureDate(Date closureDate) {
		this.closureDate = closureDate;
	}

	public Integer getClosurePersonId() {
		return closurePersonId;
	}

	public void setClosurePersonId(Integer closurePersonId) {
		this.closurePersonId = closurePersonId;
	}

	public String getClosurePersonDesc() {
		return closurePersonDesc;
	}

	public void setClosurePersonDesc(String closurePersonDesc) {
		this.closurePersonDesc = closurePersonDesc;
	}

	public String getClosureStatus() {
		return closureStatus;
	}

	public void setClosureStatus(String closureStatus) {
		this.closureStatus = closureStatus;
	}

	public boolean isCanFinalizeSuspend() {
		return canFinalizeSuspend;
	}

	public void setCanFinalizeSuspend(boolean canFinalizeSuspend) {
		this.canFinalizeSuspend = canFinalizeSuspend;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
