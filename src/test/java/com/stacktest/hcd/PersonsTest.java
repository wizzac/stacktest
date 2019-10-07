package com.stacktest.hcd;

import org.junit.Test;

import com.stacktest.hcd.dto.PersonForProfessionalDto;

public class PersonsTest {
	public int idPersonProfessionalDomene = 557;
	public int idPersonProfessionalCuk = 73572;
	public int dniPatientDomene = 38830991;
	public int dniPatientCuk = 37505377;
	public boolean malePatient = true;

	@Test
	public void getPersonForProfessionalCuk() {
		HCDConnection con = new HCDConnection("38830991M", "1234");
		PersonForProfessionalDto dto = con.ejecutar("GET", "/secure/healthCenter/22/person/data/" + dniPatientCuk + '/'
				+ (malePatient ? 'M' : 'F') + '/' + idPersonProfessionalCuk, PersonForProfessionalDto.class);
		assert dto != null;
	}

	@Test
	public void getPersonForProfessionalDomene() {
		HCDConnection con = new HCDConnection("1M", "1234");
		PersonForProfessionalDto dto = con.ejecutar("GET", "/secure/healthCenter/21/person/data/" + dniPatientDomene
				+ '/' + (malePatient ? 'M' : 'F') + '/' + idPersonProfessionalDomene, PersonForProfessionalDto.class);
		assert dto != null;
	}
}