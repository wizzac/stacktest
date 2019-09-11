package com.stacktest.hcd.dto;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TracingDto {
	
	String status;
	List<ExaminationValueOncologyDto> listOncology;
	
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<ExaminationValueOncologyDto> getListOncology() {
		return listOncology;
	}
	public void setListOncology(List<ExaminationValueOncologyDto> listOncology) {
		this.listOncology = listOncology;
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
	

}
