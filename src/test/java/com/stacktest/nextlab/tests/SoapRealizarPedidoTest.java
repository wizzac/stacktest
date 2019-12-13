package com.stacktest.nextlab.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.stacktest.Helper;
import com.stacktest.nextlab.soap.ArrayOfReqDiagnostico;
import com.stacktest.nextlab.soap.ArrayOfReqPeticion;
import com.stacktest.nextlab.soap.NextlabWS;
import com.stacktest.nextlab.soap.NextlabWSSoap;
import com.stacktest.nextlab.soap.ReqDiagnostico;
import com.stacktest.nextlab.soap.ReqMedico;
import com.stacktest.nextlab.soap.ReqOrigen;
import com.stacktest.nextlab.soap.ReqPaciente;
import com.stacktest.nextlab.soap.ReqPedido;
import com.stacktest.nextlab.soap.ReqPeticion;
import com.stacktest.nextlab.soap.ReqServicio;
import com.stacktest.nextlab.soap.ResponseRealizarPedido;

public class SoapRealizarPedidoTest {

	private String token = "nlsvctok";
	private int prescriptionId = 1;

	private NextlabWSSoap getClient() {
		NextlabWSSoap res = null;

		try {
			res = new NextlabWS(new URL("http://genetrics.ddns.net:85/Nextlab_WS.asmx?WSDL")).getNextlabWSSoap();
		} catch (MalformedURLException e) {
			e.printStackTrace();
			assert false;
		}

		return res;
	}

	@Test
	public void nuevoPedidoTest() {
		Helper.activarTrazaPorConsolaHttp();

		ResponseRealizarPedido res = null;

		try {
			/* Pedido */			
			ReqPedido pedido = crearReqPedido();
			
			/* Origen */			
			agregarReqOrigen(pedido);
			
			/* Paciente */			
			agregarReqPaciente(pedido);
			
			/* Médico */			
			agregarReqMedico(pedido);
			
			/* Servicio */			
			agregarReqServicio(pedido);

			/* Peticiones */
			agregarReqPeticiones(pedido);

			/* Diagnósticos */
			agregarReqDiagnosticos(pedido);

			res = getClient().realizarPedido(token, pedido);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		assert res != null && res.getRespuesta() != null;
		
		assert res.getRespuesta().getCodigo() == 0;
		
		assert res.getNumeroOrden() > 0;
	}

	private ReqPedido crearReqPedido() throws DatatypeConfigurationException {
		ReqPedido pedido = new ReqPedido();
		pedido.setNumero(String.valueOf(prescriptionId)); // Id de la prescripción

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());

		// Fecha hora del pedido
		pedido.setFechaPedido(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));// fecha hora actual

		// Fecha hora de entrega
		cal.add(Calendar.DATE, 10);// sumo 10 días
		pedido.setFechaEntrega(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));

		// Fecha hora de la receta
		cal = new GregorianCalendar();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -5);// resto 5 días
		pedido.setFechaReceta(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
		return pedido;
	}

	private void agregarReqOrigen(ReqPedido pedido) {
		ReqOrigen origen = new ReqOrigen();
		origen.setCodigo("A"); // Ambulatorio
		pedido.setOrigen(origen);
	}

	private void agregarReqPaciente(ReqPedido pedido) throws ParseException, DatatypeConfigurationException {
		ReqPaciente paciente = new ReqPaciente();
		paciente.setHistoria(StringUtils.EMPTY); // Es obligatorio
		paciente.setTipoDocumento("DNI");
		paciente.setNumeroDocumento("40000000");
		paciente.setApellido("Apellido");
		paciente.setNombre("Nombre");
		paciente.setSexo("M");

		// Fecha de Nacimiento
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2000"));
		paciente.setFechaNacimiento(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
		pedido.setPaciente(paciente);
	}

	private void agregarReqMedico(ReqPedido pedido) {
		ReqMedico medico = new ReqMedico();
		medico.setCodigo("123456"); // Id del médico
		medico.setMatricula("123456"); // Matrícula médico
		pedido.setMedico(medico);
	}

	private void agregarReqServicio(ReqPedido pedido) {
		ReqServicio servicio = new ReqServicio();
		servicio.setCodigo("00001");// Id del servicio
		servicio.setDescripcion("Servicio de Atención Médica");
		pedido.setServicio(servicio);
	}
	
	private void agregarReqPeticiones(ReqPedido pedido) {
		ArrayOfReqPeticion arp = new ArrayOfReqPeticion();
		ReqPeticion rp = new ReqPeticion();
		// 188 (Orina completa)
		// 195 (Hepatograma)
		// 2001 (Glucemia)
		rp.setCodigo("2001"); // Código de la petición
		rp.setUrgente("N");// N|S

		arp.getReqPeticion().add(rp);
		
		pedido.setPeticiones(arp);
	}
	
	private void agregarReqDiagnosticos(ReqPedido pedido) {
		ArrayOfReqDiagnostico ard = new ArrayOfReqDiagnostico();
		ReqDiagnostico rd = new ReqDiagnostico();
		rd.setCodigo("123456"); // Código del diagnóstico
		rd.setDescripcion("Diagnóstico de prueba");

		ard.getReqDiagnostico().add(rd);
		
		pedido.setDiagnosticos(ard);
	}
}
