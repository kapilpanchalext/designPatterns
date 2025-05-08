package com.java.email.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.java.email.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmailIgnoreCase(String email);
	boolean existByEmail(String email);
}
