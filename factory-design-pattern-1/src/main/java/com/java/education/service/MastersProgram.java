package com.java.education.service;

import com.java.education.model.FieldType;
import com.java.education.model.Program;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MastersProgram extends AbstractProgramLevel{
	
	private final FieldType field;

	@Override
	protected Program createProgram() {
		return ProgramFieldFactory.create(field);
	}

	@Override
	protected String getLevelName() {
		return "Masters";
	}
}
