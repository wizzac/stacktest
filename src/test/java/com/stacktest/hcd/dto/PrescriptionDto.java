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

	private Integer frecuency;

	private Integer refill;
	
	private Integer refillValue;

	private VademecumDto vademecum;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = ConstantConfig.SYSTEM_TIMEZONE)
	private Date date;

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

	public VademecumDto getVademecum() {
		return vademecum;
	}

	public void setVademecum(VademecumDto vademecum) {
		this.vademecum = vademecum;
	}

	public LookupDto getPosology() {
		return posology;
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
	

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
			
}
