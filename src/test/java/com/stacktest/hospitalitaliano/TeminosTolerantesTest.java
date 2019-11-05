package com.stacktest.hospitalitaliano;

import java.util.ArrayList;

import org.junit.Test;

public class TeminosTolerantesTest {
	private String url = "/v1/api/busqueda/tolerante";
	private String diagnosticoSubset = "601000999132";
	private String estudioSubset = "50641000999132";

	@Test
	public void getDiagnosticoTest() {
		Connection con = new Connection();
		SolicitudDto request = new SolicitudDto();
		request.setTexto("asma");
		request.setSubset(new ArrayList<>());
		request.getSubset().add(diagnosticoSubset);
		
		con.setMensajePost(request);
		RespuestaDto response = con.ejecutar(url, RespuestaDto.class);
		assert response != null;
	}

	@Test
	public void getEstudioTest() {
		Connection con = new Connection();
		SolicitudDto request = new SolicitudDto();
		request.setTexto("tomografía");
		request.setSubset(new ArrayList<>());
		request.getSubset().add(estudioSubset);
		
		con.setMensajePost(request);
		RespuestaDto response = con.ejecutar(url, RespuestaDto.class);
		assert response != null;
	}
}
