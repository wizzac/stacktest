package com.stacktest.hcd.dto;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class VademecumResultDto {

	private String message;
	
	private List<VademecumDto> vademecum;	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<VademecumDto> getVademecum() {
		return vademecum;
	}

	public void setVademecum(List<VademecumDto> vademecum) {
		this.vademecum = vademecum;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
	
}
