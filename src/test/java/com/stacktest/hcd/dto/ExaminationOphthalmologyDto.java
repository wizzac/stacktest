package com.stacktest.hcd.dto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ExaminationOphthalmologyDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	
	private String itemCode;

	private String examValue;
	
	@JsonIgnore
	private ConsultationDto consultation;
	public ExaminationOphthalmologyDto() {}
	
	public ExaminationOphthalmologyDto(String itemCode, String examValue) {
		this.itemCode = itemCode;
		this.examValue = examValue;
	}
	
	public ExaminationOphthalmologyDto(String name, String itemCode, String examValue) {
		super();
		this.name = name;
		this.itemCode = itemCode;
		this.examValue = examValue;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getExamValue() {
		return examValue;
	}

	public void setExamValue(String examValue) {
		this.examValue = examValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ConsultationDto getConsultation() {
		return consultation;
	}

	public void setConsultation(ConsultationDto consultation) {
		this.consultation = consultation;
	}	

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}	
}
