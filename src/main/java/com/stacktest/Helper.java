package com.stacktest;

public class Helper {
	/**
	 * Activa propiedades para mostrar los mensajes http de entrada y salida.
	 * 
	 * Muestra la información por consola.
	 */
	public static void activarTrazaPorConsolaHttp() {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
	}
}