package com.stacktest.hcd.dto;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.stacktest.hcd.config.ConstantConfig;

public class PersonV1Dto {
	private Integer id;
	private String firstName;
	private String lastName;
	private String fullName;
	private String sex;
	private Integer age;
	private String ageLabel;
	private LookupDto ageType;
	private LookupDto bloodType;
	private String photoBase64;
	private DocumentTypeV1Dto documentType;
	private String docNumber;
	//private AddressV1Dto address;
	private String insurancePlanNumber;
	private String phone;
	private PhoneDto phoneMobile;
	private String email;
	private String socialSecurityName;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = ConstantConfig.SYSTEM_TIMEZONE)
	private Date birthDay;
	private boolean hasCipe;
	private String internmentState;
	private String internmentStateLabel;
	private boolean isDocumented;
	


	private Integer motherId;

	public String getInternmentStateLabel() {
		return internmentStateLabel;
	}

	public void setInternmentStateLabel(String internmentStateLabel) {
		this.internmentStateLabel = internmentStateLabel;
	}

	public String getInternmentState() {
		return internmentState;
	}

	public void setInternmentState(String internmentState) {
		this.internmentState = internmentState;
	}

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LookupDto getAgeType() {
		return ageType;
	}

	public void setAgeType(LookupDto ageType) {
		this.ageType = ageType;
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

//	public AddressV1Dto getAddress() {
//		return address;
//	}
//
//	public void setAddress(AddressV1Dto address) {
//		this.address = address;
//	}

	public String getInsurancePlanNumber() {
		return insurancePlanNumber;
	}

	public void setInsurancePlanNumber(String insurancePlanNumber) {
		this.insurancePlanNumber = insurancePlanNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LookupDto getBloodType() {
		return bloodType;
	}

	public void setBloodType(LookupDto bloodType) {
		this.bloodType = bloodType;
	}

	public boolean isHasCipe() {
		return hasCipe;
	}

	public void setHasCipe(boolean hasCipe) {
		this.hasCipe = hasCipe;
	}

	public Integer getMotherId() {
		return motherId;
	}
	public String getAgeLabel() {
		return ageLabel;
	}

	public void setAgeLabel(String ageLabel) {
		this.ageLabel = ageLabel;
	}


	public void setMotherId(Integer motherId) {
		this.motherId = motherId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}

	public boolean isDocumented() {
		return isDocumented;
	}

	public void setDocumented(boolean documented) {
		isDocumented = documented;
	}

	public PhoneDto getPhoneMobile() {
		return phoneMobile;
	}

	public void setPhoneMobile(PhoneDto phoneMobile) {
		this.phoneMobile = phoneMobile;
	}
	
	
}