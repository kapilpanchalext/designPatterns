package com.java.email.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.java.email.util.EmailUtil;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {
	private final JavaMailSender emailSender;

	private static final String HOST = "http://localhost:9001/";
	private static final String NEW_USER_ACCOUNT_VERIFICATION = "New User Account Verification";
	
	@Value("${spring.mail.username}")
	private String fromEmail;

	@Async
	@Override
	public void sendSimpleMailMessage(String name, String to, String token) {
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setSubject(NEW_USER_ACCOUNT_VERIFICATION);
			message.setFrom(fromEmail);
			message.setTo(to);
			message.setText(EmailUtil.getEmailMessage(name, HOST, token));
			emailSender.send(message);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			throw new RuntimeException(e.getMessage());
		}
		
	}

	@Async
	@Override
	public void sendMimeMessageWithAttachments(String name, String to, String token) {
		// TODO Auto-generated method stub
		
	}

	@Async
	@Override
	public void sendMimeMessageWithEmbeddedImage(String name, String to, String token) {
		// TODO Auto-generated method stub
		
	}

	@Async
	@Override
	public void sendHTMLEmail(String name, String to, String token) {
		// TODO Auto-generated method stub
		
	}

	@Async
	@Override
	public void sendHTMLEmailWithEmbeddedFile(String name, String to, String token) {
		// TODO Auto-generated method stub
		
	}

}
