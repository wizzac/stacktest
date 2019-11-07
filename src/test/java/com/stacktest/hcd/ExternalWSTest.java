package com.stacktest.hcd;

import org.junit.Test;

import com.stacktest.hcd.dto.WsHospitalItalianoBaseDto;

public class ExternalWSTest {
	String diagnosisSearch = "hta";
	String medicineSearch = "KETOROLAC";

	@Test
	public void getDiagnosisNomenclatureDtos() {
		HCDConnection con = new HCDConnection("1M", "1234");
		con.agregarParametroGet("search", diagnosisSearch);
		WsHospitalItalianoBaseDto[] dto = con.ejecutar("GET", "/secure/external/diagnosis",
				WsHospitalItalianoBaseDto[].class);
		assert dto != null;
	}

	@Test
	public void getMedicineNomenclatureDtos() {
		HCDConnection con = new HCDConnection("1M", "1234");
		con.agregarParametroGet("search", medicineSearch);
		WsHospitalItalianoBaseDto[] dto = con.ejecutar("GET", "/secure/external/medicine",
				WsHospitalItalianoBaseDto[].class);
		assert dto != null;
	}
}
