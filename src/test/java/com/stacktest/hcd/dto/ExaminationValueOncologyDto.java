package com.stacktest.hcd.dto;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


public class ExaminationValueOncologyDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Integer consultationId;
	
	private Integer examinationGroupId;

	private String name;
	
	private String code;
	
	private String status;
	
	private List <ExaminationSubItemValueOncologyDto> examinationSubItemValueOncologyList;

	
	public ExaminationValueOncologyDto() {}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public Integer getConsultationId() {
		return consultationId;
	}

	public void setConsultationId(Integer consultationId) {
		this.consultationId = consultationId;
	}

	public Integer getExaminationGroupId() {
		return examinationGroupId;
	}

	public void setExaminationGroupId(Integer examinationGroupId) {
		this.examinationGroupId = examinationGroupId;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public List<ExaminationSubItemValueOncologyDto> getExaminationSubItemValueOncologyList() {
		return examinationSubItemValueOncologyList;
	}



	public void setExaminationSubItemValueOncologyList(List<ExaminationSubItemValueOncologyDto> examinationSubItemValueOncologyList) {
		this.examinationSubItemValueOncologyList = examinationSubItemValueOncologyList;
	}
	
	
	
	

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}


	
		
}
