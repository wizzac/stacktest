package com.stacktest.hcd.dto;

public class PersonForProfessionalDto extends PersonBaseDto {
	private boolean firstTime;

	public boolean isFirstTime() {
		return firstTime;
	}

	public void setFirstTime(boolean firstTime) {
		this.firstTime = firstTime;
	}
}
