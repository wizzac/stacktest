package com.stacktest.hcd.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonDto {

	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	private String matricula;
	
	private String sex;

	private String age;
	
	private String photoBase64;

	private Integer yearsOld;

	private Integer daysOld;
	
	private String documentType;
	
	private String docNumber;

	private String street;
	
	private String addressNumber;
	
	private String addressLine;

	private String postalCode;

	private String insurancePlanNumber;

	private String neighborhood;
	
	private String phone;
	
	private String socialSecurityName;		

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public String getPhotoBase64() {
		return photoBase64;
	}

	public void setPhotoBase64(String photoBase64) {
		this.photoBase64 = photoBase64;
	}

	public Integer getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(Integer yearsOld) {
		this.yearsOld = yearsOld;
	}

	public Integer getDaysOld() {
		return daysOld;
	}

	public void setDaysOld(Integer daysOld) {
		this.daysOld = daysOld;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getInsurancePlanNumber() {
		return insurancePlanNumber;
	}

	public void setInsurancePlanNumber(String insurancePlanNumber) {
		this.insurancePlanNumber = insurancePlanNumber;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSocialSecurityName() {
		return socialSecurityName;
	}

	public void setSocialSecurityName(String socialSecurityName) {
		this.socialSecurityName = socialSecurityName;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}