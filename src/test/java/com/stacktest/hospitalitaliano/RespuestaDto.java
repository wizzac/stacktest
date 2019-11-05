package com.stacktest.hospitalitaliano;

import java.util.List;

public class RespuestaDto {
	private String texto;
	private String especialidad;
	private List<String> subset;
	private String lang;
	private List<ResultadoDto> resultado;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public List<String> getSubset() {
		return subset;
	}

	public void setSubset(List<String> subset) {
		this.subset = subset;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public List<ResultadoDto> getResultado() {
		return resultado;
	}

	public void setResultado(List<ResultadoDto> resultado) {
		this.resultado = resultado;
	}
}
