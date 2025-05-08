package com.java.email.controller;

import java.time.LocalDateTime;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.java.email.domain.HttpResponse;
import com.java.email.domain.User;
import com.java.email.service.UserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/api/users")
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;

	@PostMapping(path = "/")
	public ResponseEntity<HttpResponse> createUser(@RequestBody User user) {
		User newUser = userService.saveUser(user);

		return ResponseEntity.status(HttpStatus.CREATED)
				.body(HttpResponse.builder().timestamp(LocalDateTime.now().toString())
						.data(Map.of("user", newUser)).message("User Created").status(HttpStatus.CREATED)
						.statusCode(HttpStatus.CREATED.value()).build());
	}
	
	@GetMapping(path = "/")
	public ResponseEntity<HttpResponse> confirmUserAccount(@RequestParam("token") String token) {
		boolean isSuccess = userService.verifyToken(token);

		return ResponseEntity.status(HttpStatus.CREATED)
				.body(HttpResponse.builder().timestamp(LocalDateTime.now().toString())
						.data(Map.of("Success", isSuccess)).message("Acount Verified").status(HttpStatus.OK)
						.statusCode(HttpStatus.OK.value()).build());
	}
}
