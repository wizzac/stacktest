package com.stacktest.hcd.dto;

import org.springframework.web.multipart.MultipartFile;

public class SignConsultationDto {
	private MultipartFile file;
	private String originalName;
	private Integer procedureId;
	private String mimeType;
	private Integer proceduretypeAttrId;
	private String code;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getOriginalName() {
		return originalName;
	}

	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

	public Integer getProcedureId() {
		return procedureId;
	}

	public void setProcedureId(Integer procedureId) {
		this.procedureId = procedureId;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public Integer getProceduretypeAttrId() {
		return proceduretypeAttrId;
	}

	public void setProceduretypeAttrId(Integer proceduretypeAttrId) {
		this.proceduretypeAttrId = proceduretypeAttrId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
