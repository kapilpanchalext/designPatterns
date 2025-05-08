package com.java.email.util;

public class EmailUtil {

	public static String getEmailMessage(String name, String host, String token) {

		String result = "Hello " + name + ",\n\nYour new account has been created. Please click "
				+ "on the link below to verify your account \n\n" + getVerificationUrl(host, token) +
				"\n\nThe Support Team";

		return result;
	}

	private static String getVerificationUrl(String host, String token) {
		
		String result = "api/users?token=";
		
		return host + result + token;
	}
}
