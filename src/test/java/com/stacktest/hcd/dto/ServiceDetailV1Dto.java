package com.stacktest.hcd.dto;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ServiceDetailV1Dto extends ServiceDto {

	private List<SpecialtyDto> specialty;

	private String profesionalNames;

	private String specialtiesNames;

	private String labelAvailableAppointment;

	private Date dateFirstAvailableAppointment;

	public List<SpecialtyDto> getSpecialty() {
		return specialty;
	}

	public void setSpecialty(List<SpecialtyDto> specialty) {
		this.specialty = specialty;
	}

	public String getProfesionalNames() {
		return profesionalNames;
	}

	public void setProfesionalNames(String profesionalNames) {
		this.profesionalNames = profesionalNames;
	}

	public String getSpecialtiesNames() {
		return specialtiesNames;
	}

	public void setSpecialtiesNames(String specialtiesNames) {
		this.specialtiesNames = specialtiesNames;
	}

	public String getLabelAvailableAppointment() {
		return labelAvailableAppointment;
	}

	public void setLabelAvailableAppointment(String labelAvailableAppointment) {
		this.labelAvailableAppointment = labelAvailableAppointment;
	}

	public Date getDateFirstAvailableAppointment() {
		return dateFirstAvailableAppointment;
	}

	public void setDateFirstAvailableAppointment(Date dateFirstAvailableAppointment) {
		this.dateFirstAvailableAppointment = dateFirstAvailableAppointment;
	}

	public int compareTo(ServiceDetailV1Dto other) {

		if ((this.dateFirstAvailableAppointment != null) && (other.getDateFirstAvailableAppointment() != null)) {
			return this.dateFirstAvailableAppointment.compareTo(other.getDateFirstAvailableAppointment());
		}

		if (this.dateFirstAvailableAppointment != null) {
			return -1;
		}

		if (other.getDateFirstAvailableAppointment() != null) {
			return 1;
		}

		if (StringUtils.equalsIgnoreCase("No hay turnos disponibles para este servicio",
				this.labelAvailableAppointment)) {
			return -1;
		}

		if (StringUtils.equalsIgnoreCase("No hay turnos disponibles para este servicio",
				other.getLabelAvailableAppointment())) {
			return -1;
		}

		if (StringUtils.equalsIgnoreCase("No pudimos obtener los turnos disponibles", this.labelAvailableAppointment)) {
			return -1;
		}

		if (StringUtils.equalsIgnoreCase("No pudimos obtener los turnos disponibles",
				other.getLabelAvailableAppointment())) {
			return -1;
		}

		if (StringUtils.equalsIgnoreCase("No hay planificaciones disponible para este servicio",
				this.labelAvailableAppointment)) {
			return -1;
		}

		if (StringUtils.equalsIgnoreCase("No hay planificaciones disponible para este servicio",
				other.getLabelAvailableAppointment())) {
			return -1;
		}

		return 1;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}

}
