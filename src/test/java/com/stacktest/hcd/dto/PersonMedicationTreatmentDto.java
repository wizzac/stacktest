package com.stacktest.hcd.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stacktest.hcd.config.ConstantConfig;

public class PersonMedicationTreatmentDto {
	private Integer id;
	private LookupValueDto medicationTreatmentType;
	private String medicationCode;
	private String medicationDesc;
	private IdNameDto professional;
	private IdNameDto person;
	private PrescriptionDto prescription;
	private IdNameDto healthCenter;
	private IdNameDto consultation;
	private String lot;
	private String brand;
	private String indications;
	private String observations;
	private boolean lastDose;

	@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
	@JsonProperty("dateSupply")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = ConstantConfig.SYSTEM_TIMEZONE)
	private Date dateSupply;

	private String status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LookupValueDto getMedicationTreatmentType() {
		return medicationTreatmentType;
	}

	public void setMedicationTreatmentType(LookupValueDto medicationTreatmentType) {
		this.medicationTreatmentType = medicationTreatmentType;
	}

	public String getMedicationCode() {
		return medicationCode;
	}

	public void setMedicationCode(String medicationCode) {
		this.medicationCode = medicationCode;
	}

	public String getMedicationDesc() {
		return medicationDesc;
	}

	public void setMedicationDesc(String medicationDesc) {
		this.medicationDesc = medicationDesc;
	}

	public IdNameDto getProfessional() {
		return professional;
	}

	public void setProfessional(IdNameDto professional) {
		this.professional = professional;
	}

	public IdNameDto getPerson() {
		return person;
	}

	public void setPerson(IdNameDto person) {
		this.person = person;
	}

	public PrescriptionDto getPrescription() {
		return prescription;
	}

	public void setPrescription(PrescriptionDto prescription) {
		this.prescription = prescription;
	}

	public IdNameDto getHealthCenter() {
		return healthCenter;
	}

	public void setHealthCenter(IdNameDto healthCenter) {
		this.healthCenter = healthCenter;
	}

	public IdNameDto getConsultation() {
		return consultation;
	}

	public void setConsultation(IdNameDto consultation) {
		this.consultation = consultation;
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getIndications() {
		return indications;
	}

	public void setIndications(String indications) {
		this.indications = indications;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public Date getDateSupply() {
		return dateSupply;
	}

	public void setDateSupply(Date dateSupply) {
		this.dateSupply = dateSupply;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isLastDose() {
		return lastDose;
	}

	public void setLastDose(boolean lastDose) {
		this.lastDose = lastDose;
	}
}