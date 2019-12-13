package com.stacktest.nextlab.dto;

public class ResultDto {
	private String codigo;
	private String descripcion;
	private String resultado;
	private String observacion;
	private String flag;
	private String unidad;
	private String metodo;
	private String valorReferencia;
	private String fechaValidacion;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public String getValorReferencia() {
		return valorReferencia;
	}

	public void setValorReferencia(String valorReferencia) {
		this.valorReferencia = valorReferencia;
	}

	public String getFechaValidacion() {
		return fechaValidacion;
	}

	public void setFechaValidacion(String fechaValidacion) {
		this.fechaValidacion = fechaValidacion;
	}
}
