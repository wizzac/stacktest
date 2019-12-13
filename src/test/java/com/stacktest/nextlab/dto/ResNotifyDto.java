package com.stacktest.nextlab.dto;

import java.util.List;

public class ResNotifyDto extends ResDto {
	private List<ResAnalysisDto> analyses;

	public List<ResAnalysisDto> getAnalyses() {
		return analyses;
	}

	public void setAnalyses(List<ResAnalysisDto> analyses) {
		this.analyses = analyses;
	}
}