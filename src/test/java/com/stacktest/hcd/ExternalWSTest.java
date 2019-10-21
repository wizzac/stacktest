package com.stacktest.hcd;

import org.junit.Test;

public class ExternalWSTest {
	String busqueda = "Ibu";

	@Test
	public void getDiagnosisNomenclatureDtos() {
		HCDConnection con = new HCDConnection("1M", "1234");
		con.agregarParametroGet("search", busqueda);
		Object dto = con.ejecutar("GET", "/secure/external/diagnosis", Object.class);
		assert dto != null;
	}
}
