package com.stacktest.hcd;

import org.junit.Test;
import org.springframework.hateoas.PagedResources;

public class NotificationTest {
	HCDConnection con = new HCDConnection("1M", "1234");// Admin

	private int idNotification = 1;
	private int idHealthCenter = 24;// 24;// Domene
	private String dateTo = "2020-04-01";

	@Test
	public void checkNotifications() {
		Object resp = con.ejecutar("GET", "/secure/healthCenter/" + idHealthCenter + "/notification/check",
				Object.class);
		assert resp != null;
	}

	@Test
	@SuppressWarnings("rawtypes")
	public void getNotificationPage() {
		con.agregarParametroGet("date_from", "");
		con.agregarParametroGet("date_to", "");
		con.agregarParametroGet("type_code", "");
		//con.agregarParametroGet("size", "20");

		PagedResources page = con.ejecutar("GET", "/secure/healthCenter/" + idHealthCenter + "/notification/page",
				PagedResources.class);
		assert page != null;
	}

	@Test
	public void setViewedNotification() {
		Object resp = con.ejecutar("PUT", "/secure/healthCenter/" + idHealthCenter + "/notification/" + idNotification + "/viewed",
				Object.class);
		assert resp != null;
	}

	@Test
	public void downloadPdf() {
		Object resp = con.ejecutar("GET", "/secure/healthCenter/" + idHealthCenter + "/notification/nonInmediateCriticalDiagnosis/download/" + dateTo,
				Object.class);
		assert resp != null;
	}

	@Test
	public void forceEmailSending() {
		Object resp = con.ejecutar("GET", "/secure/healthCenter/" + idHealthCenter + "/notification/forceEmailSending",
				Object.class);
		assert resp != null;
	}
}
