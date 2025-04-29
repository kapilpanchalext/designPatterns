package com.java.education.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.java.education.service.AbstractProgramLevel;
import com.java.education.service.ProgramFactory;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/api/v1")
@RequiredArgsConstructor
public class ProgramController {

	private final ProgramFactory programFactory;
	
	@GetMapping(path = "/enroll")
	public ResponseEntity<String> enroll(@RequestParam String level, @RequestParam String field){
			AbstractProgramLevel abstractProgramLevel = programFactory.getProgram(level, field);
		return ResponseEntity.status(HttpStatus.OK).body(abstractProgramLevel.enrollProgram());
	}
}
