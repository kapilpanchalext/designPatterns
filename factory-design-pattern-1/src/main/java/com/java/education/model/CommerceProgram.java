package com.java.education.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommerceProgram implements Program{

	@Override
	public String enroll() {
		log.info("Enrolling in Commerce Program");
		return "in Commerce.";
	}
}
