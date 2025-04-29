package com.java.education.service;

import com.java.education.model.CommerceProgram;
import com.java.education.model.EngineeringProgram;
import com.java.education.model.FieldType;
import com.java.education.model.Program;
import com.java.education.model.ScienceProgram;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PhdProgram extends AbstractProgramLevel{

	private final FieldType field;

	@Override
	protected Program createProgram() {
		return switch(field) {
		case ENGINEERING -> new EngineeringProgram();
		case COMMERCE -> new CommerceProgram();
		case SCIENCE -> new ScienceProgram();
		default -> null;
		};
	}

	@Override
	protected String getLevelName() {
		return "Phd";
	}
}
