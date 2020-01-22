package com.stacktest.hcd.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class NomenclatureDto {

	private Integer id;

	private String code;

	private String description;					
	
	private String wsCode;
	
	private String status;		
	
	public NomenclatureDto() {}

	public NomenclatureDto(Integer id, String code,String status, String description, String wsCode) {		
		this.id = id;
		this.code = code;
		this.status = status;
		this.description = description;
		this.wsCode = wsCode;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getWsCode() {
		return wsCode;
	}

	public void setWsCode(String wsCode) {
		this.wsCode = wsCode;
	}	

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
		
}
