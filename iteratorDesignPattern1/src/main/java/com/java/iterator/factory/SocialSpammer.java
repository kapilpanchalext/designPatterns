package com.java.iterator.factory;

public class SocialSpammer {
	public void send(ProfileIterator iterator, String message) {
		while(iterator.hasMore()) {
			Profile profile = iterator.getNext();
			sendEmail(profile.getEmail(), message);
			// ✅ Simulate sending email
      System.out.println("Sending email to " + profile.getEmail() + ": " + message);
		}
	}

	private void sendEmail(String email, String message) {
		System.out.println("Sending email to " + email + ": " + message);
	}
}
