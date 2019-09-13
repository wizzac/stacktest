package com.stacktest.hcd.dto;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stacktest.hcd.config.ConstantConfig;

public class PersonHasVaccineDto {

	private Integer id;

	private String status;		
	
	private String lot;
	
	private String brand;
	
	@JsonInclude(value= JsonInclude.Include.NON_EMPTY)    
    @JsonProperty("dateSupply")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = ConstantConfig.SYSTEM_TIMEZONE)
	private Date dateSupply;
	
	private String observations;
	
	private HealthCenterDto healthCenter;
	
	private PersonDto person;	
	
	private VaccineDosageDto vaccineDosage;
		
	private ConsultationDto consultation;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Date getDateSupply() {
		return dateSupply;
	}

	public void setDateSupply(Date dateSupply) {
		this.dateSupply = dateSupply;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public HealthCenterDto getHealthCenter() {
		return healthCenter;
	}

	public void setHealthCenter(HealthCenterDto healthCenter) {
		this.healthCenter = healthCenter;
	}

	public PersonDto getPerson() {
		return person;
	}

	public void setPerson(PersonDto person) {
		this.person = person;
	}

	public VaccineDosageDto getVaccineDosage() {
		return vaccineDosage;
	}

	public void setVaccineDosage(VaccineDosageDto vaccineDosage) {
		this.vaccineDosage = vaccineDosage;
	}

	public ConsultationDto getConsultation() {
		return consultation;
	}

	public void setConsultation(ConsultationDto consultation) {
		this.consultation = consultation;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}