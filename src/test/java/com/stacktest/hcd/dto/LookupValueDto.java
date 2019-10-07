package com.stacktest.hcd.dto;

public class LookupValueDto {
	private Integer id;
	private String code;
	private String name;
	LookupTypeDto lookupType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LookupTypeDto getLookupType() {
		return lookupType;
	}

	public void setLookupType(LookupTypeDto lookupType) {
		this.lookupType = lookupType;
	}
}
