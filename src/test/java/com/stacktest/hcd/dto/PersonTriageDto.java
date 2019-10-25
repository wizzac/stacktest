package com.stacktest.hcd.dto;

public class PersonTriageDto {
	private int id;
	private int level;
	private String labelTriage;
	private String labelColor;
	private String observation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}
}
