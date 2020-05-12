package com.stacktest.recipe;

import org.junit.Test;

public class LookupTest {

	@Test
	public void getDrugSupplyEntityTypes() {
		Connection con = new Connection("32811727M", "1234");
		Object[] dto = con.ejecutar("GET", "/secure/lookup/DRUG_SUPPLY_ENTITY_TYPE", Object[].class);
		assert dto != null;
	}
}
