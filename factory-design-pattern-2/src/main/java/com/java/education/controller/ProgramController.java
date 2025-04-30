package com.java.education.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.java.education.service.ProgramService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/api/v1")
@RequiredArgsConstructor
public class ProgramController {
	private final ProgramService programService;

	@PostMapping(path = "/programs")
	public ResponseEntity<String> createProgram(
			@RequestParam String level, 
			@RequestParam String field, 
			@RequestParam int age, 
			@RequestParam double gpa){

		String result = programService.createProgram(level, field, age, gpa);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

}
