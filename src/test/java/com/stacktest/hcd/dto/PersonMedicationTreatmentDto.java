package com.stacktest.hcd.dto;

import java.util.Date;

public class PersonMedicationTreatmentDto {

	private Integer id;

	private LookupValueDto medicationTreatmentType;

	private String externalMedicationCode;

	private String externalMedicationDesc;

	private PersonBaseDto person;

	private PrescriptionDto prescription;	
	
	private HealthCenterDto healthCenter;
		
	private ConsultationDto consultation;

	private String lot;

	private String brand;

	private String indications;

	private String observations;

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

	public String getExternalMedicationCode() {
		return externalMedicationCode;
	}

	public void setExternalMedicationCode(String externalMedicationCode) {
		this.externalMedicationCode = externalMedicationCode;
	}

	public String getExternalMedicationDesc() {
		return externalMedicationDesc;
	}

	public void setExternalMedicationDesc(String externalMedicationDesc) {
		this.externalMedicationDesc = externalMedicationDesc;
	}

	public PersonBaseDto getPerson() {
		return person;
	}

	public void setPerson(PersonBaseDto person) {
		this.person = person;
	}

	public PrescriptionDto getPrescription() {
		return prescription;
	}

	public void setPrescription(PrescriptionDto prescription) {
		this.prescription = prescription;
	}

	public HealthCenterDto getHealthCenter() {
		return healthCenter;
	}

	public void setHealthCenter(HealthCenterDto healthCenter) {
		this.healthCenter = healthCenter;
	}

	public ConsultationDto getConsultation() {
		return consultation;
	}

	public void setConsultation(ConsultationDto consultation) {
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
}