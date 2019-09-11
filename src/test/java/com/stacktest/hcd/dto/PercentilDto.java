package com.stacktest.hcd.dto;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PercentilDto {

	private Date date;
	private String percentilWeightXAge;
	private String percentilHeightXWeight;
	private String percentilBrainRadioXAge;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPercentilWeightXAge() {
		return percentilWeightXAge;
	}

	public void setPercentilWeightXAge(String percentilWeightXAge) {
		this.percentilWeightXAge = percentilWeightXAge;
	}

	public String getPercentilHeightXWeight() {
		return percentilHeightXWeight;
	}

	public void setPercentilHeightXWeight(String percentilHeightXWeight) {
		this.percentilHeightXWeight = percentilHeightXWeight;
	}

	public String getPercentilBrainRadioXAge() {
		return percentilBrainRadioXAge;
	}

	public void setPercentilBrainRadioXAge(String percentilBrainRadioXAge) {
		this.percentilBrainRadioXAge = percentilBrainRadioXAge;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}