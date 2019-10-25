package com.stacktest.hcd;

import org.junit.Test;

public class LookupTest {

	@Test
	public void getMedicationTreatmentTypes() {
		HCDConnection con = new HCDConnection("1M", "1234");
		Object[] dto = con.ejecutar("GET", "/secure/lookup/MEDICATION_TREATMENT_TYPE", Object[].class);
		assert dto != null;
	}
}
