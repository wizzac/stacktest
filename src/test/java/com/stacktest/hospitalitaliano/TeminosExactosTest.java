package com.stacktest.hospitalitaliano;

import java.util.ArrayList;

import org.junit.Test;

public class TeminosExactosTest {
	private String url = "/v1/api/busqueda/exacta";
	private String diagnosticoSubset = "601000999132";
	private String estudioGeneralElectricSubset = "50641000999132";
	private String estudioSubset = "631000999139";
	private String estudioGeneralSubset = "20761000999138";
	private String medicinaSubset = "35001000999130";

	@Test
	public void getDiagnosticoTest() {
		Connection con = new Connection();
		SolicitudDto request = new SolicitudDto();
		request.setTexto("Esguince del ligamento lateral interno de la rodilla");
		request.setSubset(new ArrayList<>());
		request.getSubset().add(diagnosticoSubset);
		request.setMetodo("prefix");
		
		con.setMensajePost(request);
		RespuestaDto response = con.ejecutar(url, RespuestaDto.class);
		assert response != null;
	}

	@Test
	public void getEstudioGeneralElectricTest() {
		Connection con = new Connection();
		SolicitudDto request = new SolicitudDto();
		request.setTexto("tomografía");
		request.setSubset(new ArrayList<>());
		request.getSubset().add(estudioGeneralElectricSubset);
		request.setMetodo("prefix");
		
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
		request.setMetodo("prefix");
		
		con.setMensajePost(request);
		RespuestaDto response = con.ejecutar(url, RespuestaDto.class);
		assert response != null;
	}

	@Test
	public void getEstudioGeneralTest() {
		Connection con = new Connection();
		SolicitudDto request = new SolicitudDto();
		request.setTexto("tomografía");
		request.setSubset(new ArrayList<>());
		request.getSubset().add(estudioGeneralSubset);
		request.setMetodo("prefix");
		
		con.setMensajePost(request);
		RespuestaDto response = con.ejecutar(url, RespuestaDto.class);
		assert response != null;
	}

	@Test
	public void getMedicinaTest() {
		Connection con = new Connection();
		SolicitudDto request = new SolicitudDto();
		request.setTexto("ketorolac");
		request.setSubset(new ArrayList<>());
		request.getSubset().add(medicinaSubset);
		request.setMetodo("prefix");
		
		con.setMensajePost(request);
		RespuestaDto response = con.ejecutar(url, RespuestaDto.class);
		assert response != null;
	}
}
