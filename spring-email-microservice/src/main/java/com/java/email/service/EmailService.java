package com.java.email.service;

public interface EmailService {
	void sendSimpleMailMessage(String name, String to, String token);
	void sendMimeMessageWithAttachments(String name, String to, String token);
	void sendMimeEmailWithEmbeddedFile(String name, String to, String token);
	void sendHTMLEmail(String name, String to, String token);
	void sendHTMLEmailWithEmbeddedFile(String name, String to, String token);
}
