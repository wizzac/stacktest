package com.stacktest.hcd;

import org.junit.Test;

public class VademecumTest {
	@Test
	public void getVademecumType() {
		HCDConnection con = new HCDConnection("32811727M", "1234");

		con.agregarParametroGet("benefitType", "M");
			con.agregarParametroGet("vademecumTypeId", "1");
			con.agregarParametroGet("param", "ketorolac");

		Object dto = con.ejecutar("GET", "/secure/healthCenter/23/vademecum/type", Object.class);
		assert dto != null;
	}
}
