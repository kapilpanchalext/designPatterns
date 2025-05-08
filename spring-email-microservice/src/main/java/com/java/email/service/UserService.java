package com.java.email.service;

import com.java.email.domain.User;

public interface UserService {
	User saveUser(User user);
	boolean verifyToken(String token);
}
