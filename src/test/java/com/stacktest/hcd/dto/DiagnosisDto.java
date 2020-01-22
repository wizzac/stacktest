package com.stacktest.hcd.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

//@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiagnosisDto {
	
	private Integer id;
	
	private String description;
	
	private String observation;

	private String diagnosisType;		
	
	private NomenclatureDto diagnosisNomenclature;
		
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

	public NomenclatureDto getDiagnosisNomenclature() {
		return diagnosisNomenclature;
	}

	public void setDiagnosisNomenclature(NomenclatureDto diagnosisNomenclature) {
		this.diagnosisNomenclature = diagnosisNomenclature;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
