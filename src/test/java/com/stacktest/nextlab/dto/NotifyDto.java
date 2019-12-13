package com.stacktest.nextlab.dto;

import java.util.List;

public class NotifyDto {
	private String token;
	private String number;
	private List<AnalysisDto> analyses;
	private String base64Pdf;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public List<AnalysisDto> getAnalyses() {
		return analyses;
	}

	public void setAnalyses(List<AnalysisDto> analyses) {
		this.analyses = analyses;
	}

	public String getBase64Pdf() {
		return base64Pdf;
	}

	public void setBase64Pdf(String base64Pdf) {
		this.base64Pdf = base64Pdf;
	}
}
