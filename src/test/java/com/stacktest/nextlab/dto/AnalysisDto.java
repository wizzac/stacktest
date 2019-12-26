
package com.stacktest.nextlab.dto;

import java.util.List;

public class AnalysisDto {
	private String code;
	private String hibaCode;
	private String status;
	private String description;
	private List<ResultDto> results;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getHibaCode() {
		return hibaCode;
	}

	public void setHibaCode(String hibaCode) {
		this.hibaCode = hibaCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ResultDto> getResults() {
		return results;
	}

	public void setResults(List<ResultDto> results) {
		this.results = results;
	}
}
