package com.java.email.service;

import java.io.File;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import com.java.email.util.EmailUtil;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
	public class EmailServiceImpl implements EmailService {

	private final JavaMailSender emailSender;
	private static final String HOST = "http://localhost:9001/";
	private static final String NEW_USER_ACCOUNT_VERIFICATION = "New User Account Verification";
	private static final String UTF_8_ENCODING = "UTF-8";

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
		try {
			MimeMessage message = getMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, true, UTF_8_ENCODING);
			helper.setPriority(1);
			helper.setSubject(NEW_USER_ACCOUNT_VERIFICATION);
			helper.setFrom(fromEmail);
			helper.setTo(to);
			helper.setText(EmailUtil.getEmailMessage(name, HOST, token));

			// Add Attachments
			FileSystemResource file1Image = new FileSystemResource(new File("D:\\tomcat\\webapps\\examples\\jsp\\jsp2\\jspx\\textRotate.jpg"));
			FileSystemResource file2Pdf = new FileSystemResource(new File("C:\\Users\\kapil.panchal.ext\\Desktop\\next-gen-js-summary.pdf"));

			helper.addAttachment(file1Image.getFilename(), file1Image);
			helper.addAttachment(file2Pdf.getFilename(), file2Pdf);

			emailSender.send(message);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			throw new RuntimeException(e.getMessage());
		}

	}

	@Async
	@Override
	public void sendMimeEmailWithEmbeddedFile(String name, String to, String token) {
		try {
			MimeMessage message = getMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, true, UTF_8_ENCODING);
			helper.setPriority(1);
			helper.setSubject(NEW_USER_ACCOUNT_VERIFICATION);
			helper.setFrom(fromEmail);
			helper.setTo(to);
			helper.setText(EmailUtil.getEmailMessage(name, HOST, token));

			// Add Attachments
			FileSystemResource file1Image = new FileSystemResource(new File("D:\\tomcat\\webapps\\examples\\jsp\\jsp2\\jspx\\textRotate.jpg"));
			FileSystemResource file2Pdf = new FileSystemResource(new File("C:\\Users\\kapil.panchal.ext\\Desktop\\next-gen-js-summary.pdf"));

			helper.addInline(getContentId(file1Image.getFilename()), file1Image);
			helper.addInline(getContentId(file2Pdf.getFilename()), file2Pdf);

			emailSender.send(message);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			throw new RuntimeException(e.getMessage());
		}

	}

	@Async
	@Override
	public void sendHTMLEmail(String name, String to, String token) {
		
	}

	@Async
	@Override
	public void sendHTMLEmailWithEmbeddedFile(String name, String to, String token) {
		
	}

	private MimeMessage getMimeMessage() {
		return emailSender.createMimeMessage();
	}

	private String getContentId(String filename) {
		return "<" + filename + ">";
	}

}
