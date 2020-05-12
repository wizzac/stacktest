package com.stacktest.hcd.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PhoneDto {

	private String areaCode;
	
	private String number;
	
	private String alias;
	
	
	
	public String getAreaCode() {
		return areaCode;
	}



	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public String getAlias() {
		return alias;
	}



	public void setAlias(String alias) {
		this.alias = alias;
	}



	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}