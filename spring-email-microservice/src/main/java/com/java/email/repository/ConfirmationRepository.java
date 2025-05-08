package com.java.email.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.java.email.domain.Confirmation;

public interface ConfirmationRepository extends JpaRepository<Confirmation, Long> {
	Confirmation findByToken(String token);
}
