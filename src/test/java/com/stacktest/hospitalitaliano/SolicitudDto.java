package com.stacktest.hospitalitaliano;

import java.util.List;

public class SolicitudDto {
	private String texto;
	private List<String> subset;
	private String metodo;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public List<String> getSubset() {
		return subset;
	}

	public void setSubset(List<String> subset) {
		this.subset = subset;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
}
