package com.stacktest.hcd.dto;

public class PersonTriageTypeDto {
	private int level;
	private String labelTriage;
	private String labelColor;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getLabelTriage() {
		return labelTriage;
	}

	public void setLabelTriage(String labelTriage) {
		this.labelTriage = labelTriage;
	}

	public String getLabelColor() {
		return labelColor;
	}

	public void setLabelColor(String labelColor) {
		this.labelColor = labelColor;
	}
}
