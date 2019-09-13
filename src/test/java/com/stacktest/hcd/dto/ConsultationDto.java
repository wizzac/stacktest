package com.stacktest.hcd.dto;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultationDto {

	private Integer id;

	private String status;

	private String addictions;

	private String bloodPressure;

	private String bodyMass;
	
	private String bodySurface;

	private Integer breathingFrecuency;
	
	@JsonInclude(value= JsonInclude.Include.NON_EMPTY)    
    @JsonProperty("endTime")	
	private Date endTime;
	
	private String familyBackground;

	private String personalBackground;
	
	private Integer heartRate;

	private Integer height;
	
	private String previousTreatment;

	private String reason;

	@JsonInclude(value= JsonInclude.Include.NON_EMPTY)    
    @JsonProperty("startTime")	
	private Date startTime;
	
	private String symptom;

	private String temperature;

	private String weight;

	private String brainRadio;

	private Integer monthsAge;
		
	private HealthCenterDto healthCenter;
	
	private ServiceDto service;
	
	private SpecialtyDto specialty;
	
	private ScheduleDto schedule;	
	
	private PercentilDto percentiles;

	private List<PersonHasVaccineDto> personHasVaccines;
	
	private List<DiagnosisDtoMin> diagnosis;
	
	private List<PrescriptionDto> prescriptions;
	
	private List<PrescriptionDto> ophthalmologicPrescriptions;
	
	private List<ExaminationOphthalmologyDto> examinationOphthalmologyDtos;
	
	private List<ExaminationValueDto> examinationValues;

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

	public String getAddictions() {
		return addictions;
	}

	public void setAddictions(String addictions) {
		this.addictions = addictions;
	}

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public String getBodyMass() {
		return bodyMass;
	}

	public void setBodyMass(String bodyMass) {
		this.bodyMass = bodyMass;
	}

	
	public String getBodySurface() {
		return bodySurface;
	}

	public void setBodySurface(String bodySurface) {
		this.bodySurface = bodySurface;
	}

	public Integer getBreathingFrecuency() {
		return breathingFrecuency;
	}

	public void setBreathingFrecuency(Integer breathingFrecuency) {
		this.breathingFrecuency = breathingFrecuency;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getFamilyBackground() {
		return familyBackground;
	}

	public void setFamilyBackground(String familyBackground) {
		this.familyBackground = familyBackground;
	}

	public String getPersonalBackground() {
		return personalBackground;
	}

	public void setPersonalBackground(String personalBackground) {
		this.personalBackground = personalBackground;
	}

	public Integer getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(Integer heartRate) {
		this.heartRate = heartRate;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getPreviousTreatment() {
		return previousTreatment;
	}

	public void setPreviousTreatment(String previousTreatment) {
		this.previousTreatment = previousTreatment;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getBrainRadio() {
		return brainRadio;
	}

	public void setBrainRadio(String brainRadio) {
		this.brainRadio = brainRadio;
	}

	public Integer getMonthsAge() {
		return monthsAge;
	}

	public void setMonthsAge(Integer monthsAge) {
		this.monthsAge = monthsAge;
	}

	public ScheduleDto getSchedule() {
		return schedule;
	}

	public void setSchedule(ScheduleDto schedule) {
		this.schedule = schedule;
	}

	public PercentilDto getPercentiles() {
		return percentiles;
	}

	public void setPercentiles(PercentilDto percentiles) {
		this.percentiles = percentiles;
	}

	public List<PersonHasVaccineDto> getPersonHasVaccines() {
		return personHasVaccines;
	}

	public void setPersonHasVaccines(List<PersonHasVaccineDto> personHasVaccines) {
		this.personHasVaccines = personHasVaccines;
	}

	public List<DiagnosisDtoMin> getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(List<DiagnosisDtoMin> diagnosis) {
		this.diagnosis = diagnosis;
	}

	public List<PrescriptionDto> getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(List<PrescriptionDto> prescriptions) {
		this.prescriptions = prescriptions;
	}

	public List<PrescriptionDto> getOphthalmologicPrescriptions() {
		return ophthalmologicPrescriptions;
	}

	public void setOphthalmologicPrescriptions(List<PrescriptionDto> ophthalmologicPrescriptions) {
		this.ophthalmologicPrescriptions = ophthalmologicPrescriptions;
	}

	public List<ExaminationOphthalmologyDto> getExaminationOphthalmologyDtos() {
		return examinationOphthalmologyDtos;
	}

	public void setExaminationOphthalmologyDtos(List<ExaminationOphthalmologyDto> examinationOphthalmologyDtos) {
		this.examinationOphthalmologyDtos = examinationOphthalmologyDtos;
	}

	public List<ExaminationValueDto> getExaminationValues() {
		return examinationValues;
	}

	public void setExaminationValues(List<ExaminationValueDto> examinationValues) {
		this.examinationValues = examinationValues;
	}

	public HealthCenterDto getHealthCenter() {
		return healthCenter;
	}

	public void setHealthCenter(HealthCenterDto healthCenter) {
		this.healthCenter = healthCenter;
	}

	public ServiceDto getService() {
		return service;
	}

	public void setService(ServiceDto service) {
		this.service = service;
	}

	public SpecialtyDto getSpecialty() {
		return specialty;
	}

	public void setSpecialty(SpecialtyDto specialty) {
		this.specialty = specialty;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
