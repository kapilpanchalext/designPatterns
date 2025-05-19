package com.java.observer.factory;

public class EmailAlertsListener implements EventListener {
	private String email;
	private String message;

	public EmailAlertsListener(String email, String message) {
		this.email=email;
		this.message=message;
	}

	@Override
	public void update(String filename) {
		System.out.println("Email To: " + email + ": " + message.replace("%s", filename));
	}

}
