package com.java.education.service;

import org.springframework.stereotype.Service;
import com.java.education.model.FieldType;

@Service
public class ProgramFactory {

	public AbstractProgramLevel getProgram(String level, String field) {
		FieldType fieldType = FieldType.valueOf(field.toUpperCase());

			return switch (level.toLowerCase()) {
			case "bachelors" -> new BachelorsProgram(fieldType);
			case "masters" -> new MastersProgram(fieldType);
			case "phd" -> new PhdProgram(fieldType);
			default -> throw new IllegalArgumentException("Invalid Program Level: " + level);
		};
	}
}
