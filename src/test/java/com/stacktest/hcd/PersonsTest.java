package com.stacktest.hcd;

import org.junit.Test;

import com.stacktest.hcd.mobile.dto.ScheduleSimpleDto;

public class PersonsTest {
	public int idPersonProfessionalDomene = 557;
	public int idPersonProfessionalCuk = 73572;
	public int dniPatientDomene = 45117218;
	public int dniPatientCuk = 37505377;
	public boolean malePatient = true;

	@Test
	public void getPersonForProfessionalCuk() {
		HCDConnection con = new HCDConnection("38830991M", "1234");
		ScheduleSimpleDto dto = con.ejecutar("GET", "/secure/healthCenter/22/person/data/" + dniPatientDomene + '/'
				+ (malePatient ? 'M' : 'F') + '/' + idPersonProfessionalCuk, ScheduleSimpleDto.class);
		assert dto != null;
	}

	@Test
	public void getPersonForProfessionalDomene() {
		HCDConnection con = new HCDConnection("1M", "1234");
		ScheduleSimpleDto dto = con.ejecutar("GET", "/secure/healthCenter/21/person/data/" + dniPatientCuk + '/'
				+ (malePatient ? 'M' : 'F') + '/' + idPersonProfessionalDomene, ScheduleSimpleDto.class);
		assert dto != null;
	}
}