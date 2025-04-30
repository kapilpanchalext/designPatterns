package com.java.education.service.factory;

import org.springframework.stereotype.Component;

@Component
public class ProgramFactory {

	public AbstractProgram getProgram(String level, String field) {
		switch (level.toLowerCase()) {
		case "bachelor":
			return new BachelorProgram(field);
		case "master":
			return new MasterProgram(field);
		case "phd":
			return new PhDProgram(field);
		default:
			throw new IllegalArgumentException("Invalid program level: " + level);
		}
	}
}
