package com.java.email.service;

import org.springframework.stereotype.Service;
import com.java.email.domain.Confirmation;
import com.java.email.domain.User;
import com.java.email.repository.ConfirmationRepository;
import com.java.email.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	private final UserRepository userRepository;
	private final ConfirmationRepository confirmationRepository;
	private final EmailService emailService;

	@Override
	public User saveUser(User user) {
		
		if(userRepository.existsByEmail(user.getEmail())) {
			throw new RuntimeException("Email already Exists!");
		}
		user.setEnabled(false);
		userRepository.save(user);
		
		Confirmation confirmation = new Confirmation(user);
		confirmationRepository.save(confirmation);
		
		/** TODO Send email to user with Token */
//		emailService.sendSimpleMailMessage(user.getName(), user.getEmail(), confirmation.getToken());
//		emailService.sendMimeMessageWithAttachments(user.getName(), user.getEmail(), confirmation.getToken());
		emailService.sendMimeEmailWithEmbeddedFile(user.getName(), user.getEmail(), confirmation.getToken());
		return user;
	}

	@Override
	public boolean verifyToken(String token) {
		Confirmation confirmation = confirmationRepository.findByToken(token);
		User user = userRepository.findByEmailIgnoreCase(confirmation.getUser().getEmail());
		user.setEnabled(true);
		userRepository.save(user);
		return Boolean.TRUE;
	}
}
