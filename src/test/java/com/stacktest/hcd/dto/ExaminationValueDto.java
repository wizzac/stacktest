package com.stacktest.hcd.dto;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stacktest.hcd.config.ConstantConfig;

public class ExaminationValueDto {
	
//	"examinationValueId": 123,
//	"consultationId": 456,
//	"examValue": "Blablablabla",
//	"examinationItemCode": "PIEZA17",
//	"examinationSubItemCode": "CARA_VESTIBULAR",
//	"examinationSubItemName": "Cara Vestibular",
//	"diagnosisDescription": "Blablablabla",
//	"diagnosisNomenclatureCode": "425.A",
//	"prescriptionVademecumCcode": "02.02",
//	"dateExamination":"13-12-2017"
	
	private Integer examinationValueId;
	
	private String examValue;
	
	private String examinationItemCode;
	
	private String examinationItemName;
	
	private String examinationSubItemCode;
	
	private String examinationSubItemName;
	
	private String status;
	
	private String diagnosisDescription;

	private String diagnosisNomenclatureCode;
	
	private String prescriptionVademecumCode;
	
	private String prescriptionVademecumActivePrinciple;

	private Integer consultationId;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = ConstantConfig.SYSTEM_TIMEZONE)
	private Date dateExamination;

	public ExaminationValueDto() {
	}	

	public ExaminationValueDto(String examinationItemCode, String examValue) {
		this.examinationItemCode = examinationItemCode;
		this.examValue = examValue;
	}

	public Integer getExaminationValueId() {
		return examinationValueId;
	}

	public void setExaminationValueId(Integer examinationValueId) {
		this.examinationValueId = examinationValueId;
	}

	public String getExamValue() {
		return examValue;
	}

	public void setExamValue(String examValue) {
		this.examValue = examValue;
	}

	public String getExaminationItemCode() {
		return examinationItemCode;
	}

	public void setExaminationItemCode(String examinationItemCode) {
		this.examinationItemCode = examinationItemCode;
	}

	public String getExaminationSubItemCode() {
		return examinationSubItemCode;
	}

	public void setExaminationSubItemCode(String examinationSubItemCode) {
		this.examinationSubItemCode = examinationSubItemCode;
	}

	public String getExaminationSubItemName() {
		return examinationSubItemName;
	}

	public void setExaminationSubItemName(String examinationSubItemName) {
		this.examinationSubItemName = examinationSubItemName;
	}

	public String getDiagnosisDescription() {
		return diagnosisDescription;
	}

	public void setDiagnosisDescription(String diagnosisDescription) {
		this.diagnosisDescription = diagnosisDescription;
	}

	public String getDiagnosisNomenclatureCode() {
		return diagnosisNomenclatureCode;
	}

	public void setDiagnosisNomenclatureCode(String diagnosisNomenclatureCode) {
		this.diagnosisNomenclatureCode = diagnosisNomenclatureCode;
	}

	public String getPrescriptionVademecumCode() {
		return prescriptionVademecumCode;
	}

	public void setPrescriptionVademecumCode(String prescriptionVademecumCode) {
		this.prescriptionVademecumCode = prescriptionVademecumCode;
	}

	public Integer getConsultationId() {
		return consultationId;
	}

	public void setConsultationId(Integer consultationId) {
		this.consultationId = consultationId;
	}

	public Date getDateExamination() {
		return dateExamination;
	}

	public void setDateExamination(Date dateExamination) {
		this.dateExamination = dateExamination;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPrescriptionVademecumActivePrinciple() {
		return prescriptionVademecumActivePrinciple;
	}

	public void setPrescriptionVademecumActivePrinciple(String prescriptionVademecumActivePrinciple) {
		this.prescriptionVademecumActivePrinciple = prescriptionVademecumActivePrinciple;
	}

	public String getExaminationItemName() {
		return examinationItemName;
	}

	public void setExaminationItemName(String examinationItemName) {
		this.examinationItemName = examinationItemName;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}