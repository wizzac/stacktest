package com.stacktest.hcd.dto;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class StudiesResultDto {

	private String message;
	
	private List<StudyDto> studies;	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<StudyDto> getStudies() {
		return studies;
	}

	public void setStudies(List<StudyDto> studies) {
		this.studies = studies;
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
