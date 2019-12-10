package com.stacktest.nextlab.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;

import javax.xml.datatype.DatatypeConfigurationException;

import org.junit.Test;

import com.stacktest.Helper;
import com.stacktest.nextlab.soap.NextlabWS;
import com.stacktest.nextlab.soap.NextlabWSSoap;
import com.stacktest.nextlab.soap.ResponseConsultarResultados;

public class WSConsultarResultadosTest {

	private String token = "nlsvctok";
	private int prescriptionId = 99032365;

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
	public void consultarPedidoTest() throws DatatypeConfigurationException, ParseException {
		Helper.activarTrazaPorConsolaHttp();

		ResponseConsultarResultados res = getClient().consultarResultados(token, 0, String.valueOf(prescriptionId));

		assert res != null && res.getRespuesta() != null;

		assert res.getRespuesta().getCodigo() == 0;
	}
}
