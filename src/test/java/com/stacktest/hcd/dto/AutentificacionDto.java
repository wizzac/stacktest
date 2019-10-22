package com.stacktest.hcd.dto;

import java.util.Date;

public class AutentificacionDto {
	private int nroDocumento;
	private boolean masculino;
	private String bearer;
	private Date fecha;

	public int getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public boolean isMasculino() {
		return masculino;
	}

	public void setMasculino(boolean masculino) {
		this.masculino = masculino;
	}

	public String getBearer() {
		return bearer;
	}

	public void setBearer(String bearer) {
		this.bearer = bearer;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
