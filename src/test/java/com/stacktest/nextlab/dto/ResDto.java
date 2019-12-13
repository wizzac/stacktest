package com.stacktest.nextlab.dto;

public class ResDto {
	private boolean success;
	private String errorCode;
	private String errorMesssage;
	
	public boolean isSuccess() {
		return success;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMesssage() {
		return errorMesssage;
	}
	
	public void setSuccess() {
		success = true;
	}

	public void setError(String errorCode, String errorMesssage) {
		success = false;
		this.errorCode = errorCode;
		this.errorMesssage = errorMesssage;
	}
}
