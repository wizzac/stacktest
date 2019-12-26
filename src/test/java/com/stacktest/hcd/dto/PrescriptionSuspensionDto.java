package com.stacktest.hcd.dto;

import java.util.Date;

public class PrescriptionSuspensionDto {
	private Date suspensionDate;

	private String suspensionReason;

	public Date getSuspensionDate() {
		return suspensionDate;
	}

	public void setSuspensionDate(Date suspensionDate) {
		this.suspensionDate = suspensionDate;
	}

	public String getSuspensionReason() {
		return suspensionReason;
	}

	public void setSuspensionReason(String suspensionReason) {
		this.suspensionReason = suspensionReason;
	}
}
