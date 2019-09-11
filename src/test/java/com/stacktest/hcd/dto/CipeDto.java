package com.stacktest.hcd.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class CipeDto {
	
	Boolean enabled;
	
	String labelDetail;

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getLabelDetail() {
		return labelDetail;
	}

	public void setLabelDetail(String labelDetail) {
		this.labelDetail = labelDetail;
	}
	
	

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
	
	
		

}
