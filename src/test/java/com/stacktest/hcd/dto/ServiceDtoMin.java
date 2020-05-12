package com.stacktest.hcd.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ServiceDtoMin {

	private Integer id;
	
	private String name;		
	
	private boolean isDemand;
	
	private String locationInstructions;

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public boolean isDemand() {
		return isDemand;
	}


	public void setDemand(boolean isDemand) {
		this.isDemand = isDemand;
	}

	

	public String getLocationInstructions() {
		return locationInstructions;
	}


	public void setLocationInstructions(String locationInstructions) {
		this.locationInstructions = locationInstructions;
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
	
}
