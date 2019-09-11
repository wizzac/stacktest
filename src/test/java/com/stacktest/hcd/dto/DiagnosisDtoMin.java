package com.stacktest.hcd.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

//@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiagnosisDtoMin {

	private Integer id;

	private String description;

	private String diagnosisType;
	
	private String diagnosisNomenclatureCode;
	
	private String diagnosisNomenclatureName;

	private String examinationValue;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDiagnosisType() {
		return diagnosisType;
	}

	public void setDiagnosisType(String diagnosisType) {
		this.diagnosisType = diagnosisType;
	}

	public String getDiagnosisNomenclatureCode() {
		return diagnosisNomenclatureCode;
	}

	public void setDiagnosisNomenclatureCode(String diagnosisNomenclatureCode) {
		this.diagnosisNomenclatureCode = diagnosisNomenclatureCode;
	}

	public String getDiagnosisNomenclatureName() {
		return diagnosisNomenclatureName;
	}

	public void setDiagnosisNomenclatureName(String diagnosisNomenclatureName) {
		this.diagnosisNomenclatureName = diagnosisNomenclatureName;
	}

	public String getExaminationValue() {
		return examinationValue;
	}

	public void setExaminationValue(String examinationValue) {
		this.examinationValue = examinationValue;
	}
	
	

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
