package com.stacktest.hospitalitaliano;

import java.util.ArrayList;

import org.junit.Test;

public class TeminosExactosTest {
	private String url = "/v1/api/busqueda/exacta";
	private String diagnosticoSubset = "601000999132";
	private String estudioSubset = "50641000999132";

	@Test
	public void getDiagnosticoTest() {
		Connection con = new Connection();
		SolicitudDto request = new SolicitudDto();
		request.setTexto("asma");
		request.setSubset(new ArrayList<>());
		request.getSubset().add(diagnosticoSubset);
		request.setMetodo("word");
		
		con.setMensajePost(request);
		RespuestaDto response = con.ejecutar(url, RespuestaDto.class);
		assert response != null;
	}
	
	@Test
	public void getEstudioTest() {
		Connection con = new Connection();
		SolicitudDto request = new SolicitudDto();
		request.setTexto("tomografia");
		request.setSubset(new ArrayList<>());
		request.getSubset().add(estudioSubset);
		
		con.setMensajePost(request);
		RespuestaDto response = con.ejecutar(url, RespuestaDto.class);
		assert response != null;
	}
}
