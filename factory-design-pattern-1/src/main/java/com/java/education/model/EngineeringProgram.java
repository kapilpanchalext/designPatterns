package com.java.education.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EngineeringProgram implements Program {

	@Override
	public String enroll() {
		log.info("Enrolling in Engineering Program");
		return "in Engineering.";
	}

}
