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
				"Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIyNDk5MDUwNE1AY2lwZXNhbmx1aXMubmV0IiwidXNlcklkIjoyLCJkb2NOdW1iZXIiOiIyNDk5MDUwNCIsInNleCI6Ik0iLCJpc3MiOiJodHRwOi8vc3RhY2t0cmFjZS5jb20uYXIiLCJpYXQiOjE1ODAzMDM5NjcsImV4cCI6MTU4MDMzMjc2N30.P5JJ4MPVQpLi4IAmWZOnpe4HzUavMFb5QsluoHd_AygoAy1imd-T4ajFYZRn9amI5de4L60aGaY02xVCmkrVBA");

		con.setMensajePost(dto);
		Object resp = con.ejecutar("POST", "/token/external/login", Object.class);
		assert resp != null;
	}
}
