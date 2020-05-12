package com.stacktest.hcd.dto;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stacktest.hcd.config.ConstantConfig;

public class PersonBaseDto {
	private int id;
	private String firstName;
	private String lastName;
	private String sex;
	private String age;
	private String ageLabel;
	private LookupValueDto ageType;
	private LookupValueDto bloodType;
	private String agePercentile;
	private Integer daysOld;
	private Integer yearsOld;
	private String photoBase64;
	private DocumentTypeV1Dto documentType;
	private String docNumber;
	private String familyBackground;
	private String personalBackground;
	private String notes;
	private String insurancePlanNumber;
	private String phone;
	private PhoneDto phoneMobile;
	private String email;
	private String socialSecurityName;
	private Date birthDay;
	private boolean hasCipe;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAgeLabel() {
		return ageLabel;
	}

	public void setAgeLabel(String ageLabel) {
		this.ageLabel = ageLabel;
	}

	public LookupValueDto getAgeType() {
		return ageType;
	}

	public void setAgeType(LookupValueDto ageType) {
		this.ageType = ageType;
	}

	public LookupValueDto getBloodType() {
		return bloodType;
	}

	public void setBloodType(LookupValueDto bloodType) {
		this.bloodType = bloodType;
	}

	public String getAgePercentile() {
		return agePercentile;
	}

	public void setAgePercentile(String agePercentile) {
		this.agePercentile = agePercentile;
	}

	public Integer getDaysOld() {
		return daysOld;
	}

	public void setDaysOld(Integer daysOld) {
		this.daysOld = daysOld;
	}

	public Integer getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(Integer yearsOld) {
		this.yearsOld = yearsOld;
	}

	public String getPhotoBase64() {
		return photoBase64;
	}

	public void setPhotoBase64(String photoBase64) {
		this.photoBase64 = photoBase64;
	}

	public DocumentTypeV1Dto getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentTypeV1Dto documentType) {
		this.documentType = documentType;
	}

	public String getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getInsurancePlanNumber() {
		return insurancePlanNumber;
	}

	public void setInsurancePlanNumber(String insurancePlanNumber) {
		this.insurancePlanNumber = insurancePlanNumber;
	}

	public String getPhone() {
		String result = null;
		if (phoneMobile != null) {
			// priorizo lo cargado como phoneMobileNumber que es lo ultimo;
			if (StringUtils.isNotEmpty(phoneMobile.getAreaCode())) 
				result = this.phoneMobile.getAreaCode().trim() + "-";
			
			if (StringUtils.isNotEmpty(phoneMobile.getNumber())) 
				result = StringUtils.defaultString(result) + this.phoneMobile.getNumber().trim();
			
			if (StringUtils.isNotEmpty(phoneMobile.getAlias())) 
				result = StringUtils.defaultString(result) + "(" + this.phoneMobile.getAlias().trim() + ")";
			
		} else if (StringUtils.isEmpty(result)) 
			// sino lo tiene cargado voy al default
			result = this.phone;

		return result;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public PhoneDto getPhoneMobile() {
		return phoneMobile;
	}

	public void setPhoneMobile(PhoneDto phoneMobile) {
		this.phoneMobile = phoneMobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSocialSecurityName() {
		return socialSecurityName;
	}

	public void setSocialSecurityName(String socialSecurityName) {
		this.socialSecurityName = socialSecurityName;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = ConstantConfig.SYSTEM_TIMEZONE)
	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public boolean isHasCipe() {
		return hasCipe;
	}

	public void setHasCipe(boolean hasCipe) {
		this.hasCipe = hasCipe;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
