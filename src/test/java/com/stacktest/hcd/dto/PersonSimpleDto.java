package com.stacktest.hcd.dto;

public class PersonSimpleDto {
	private int id;
	private String firstName;
	private String lastName;
	private String sex;
	private String age;
	private String agePercentile;
	private String photoBase64;
	private String docNumber;
	private String familyBackground;
	private String personalBackground;
	private String notes;
	private BloodTypeDto bloodType;

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

	public String getAgePercentile() {
		return agePercentile;
	}

	public void setAgePercentile(String agePercentile) {
		this.agePercentile = agePercentile;
	}

	public String getPhotoBase64() {
		return photoBase64;
	}

	public void setPhotoBase64(String photoBase64) {
		this.photoBase64 = photoBase64;
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

	public BloodTypeDto getBloodType() {
		return bloodType;
	}

	public void setBloodType(BloodTypeDto bloodType) {
		this.bloodType = bloodType;
	}
}
