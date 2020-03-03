package com.stacktest.hcd;

import org.junit.Test;

import com.stacktest.hcd.dto.ExternalUserDto;

public class ExternalTokenTest {
	HCDConnection con = new HCDConnection("32811727M", "1234");// Domene

	@Test
	public void getMyExternalConsultation() {
		Object resp = con.ejecutar("GET", "/secure/external/consultation/person/", Object.class);
		assert resp != null;
	}

	@Test
	public void login() {
		ExternalUserDto dto = new ExternalUserDto();
		dto.setApiCode("8f6324c1-ea19-409a-9b0d-f11ddf3d3e4c");
		dto.setExternalToken(
				"Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJFWFRFUk5BTF9QT1JUQUxfUFVOVEFOTyIsInNjb3BlcyI6eyJoZWFsdGhDZW50ZXJIYXNPcGVyYXRvciI6W3siaWQiOjE0MTcsInN0YXR1cyI6IkFDVCIsImhlYWx0aENlbnRlciI6eyJpZCI6MSwiYWRkcmVzcyI6bnVsbCwibmFtZSI6Ik1JTklTVEVSSU8gREUgU0FMVUQiLCJwaG9uZSI6IjEiLCJpbnRlcm5hbENvZGUiOiIxIiwicGxhbm5pbmciOnRydWV9LCJpc1Byb2Zlc3Npb25hbCI6ZmFsc2UsImhhc1dhaXRNYW5hZ2FtZW50IjpmYWxzZSwiaGFzTXVsdGlwbGVTZXJ2aWNlc1Byb2ZmZXNpb25hbCI6dHJ1ZSwicHJvZmVzc2lvbmFsIjpmYWxzZSwibmV3U2NoZWR1bGUiOnRydWV9XSwiZmxhZ3MiOnsiZW5hYmxlZENvbnN1bHRhdGlvbiI6dHJ1ZSwiZW5hYmxlZFByZXNjcmlwdGlvbk1lZGljaW5lcyI6ZmFsc2UsImVuYWJsZWRQcmVzY3JpcHRpb25TdHVkaWVzIjpmYWxzZX0sImlkIjoxMjYwfSwiaXNzIjoiaHR0cDovL3N0YWNrdHJhY2UuY29tLmFyIiwiaWF0IjoxNTgxNDI4OTQ5LCJleHAiOjE1ODE0NTc3NDl9.DLy_ayHVu3MKzVjNezaoTm2mMid305M4lHUE0d1175TfbDDxLEZG1wd7uF_wurJHqWRvhz8k1zPBMDF-VsXqVg");

		con.setMensajePost(dto);
		Object resp = con.ejecutar("POST", "/token/external/login", Object.class);
		assert resp != null;
	}

	@Test
	public void getMyExternalSpecialties() {
		Object resp = con.ejecutar("GET", "/secure/external//mobile/specialty/person", Object.class);
		assert resp != null;
	}
}
