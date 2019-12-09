package com.stacktest.nextlab.tests;

import org.apache.camel.component.hl7.HL726Converter;
import org.junit.Test;

import com.google.gson.Gson;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v26.message.OML_O21;

public class OML021Test {

	@Test
	public void crearOMLO21Test() {
		OML_O21 res = null;
		try {
			OML_O21 dto = new OML_O21();
						
			String json = new Gson().toJson(dto);
			res = HL726Converter.toOmlO21(json);
		} catch (HL7Exception e) {
			e.printStackTrace();
			assert false;
		} catch (Exception e) {
			e.printStackTrace();
			assert false;
		}
		
		assert res != null;
	}
}
