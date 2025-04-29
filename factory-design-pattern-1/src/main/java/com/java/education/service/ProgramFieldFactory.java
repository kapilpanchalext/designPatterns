package com.java.education.service;

import com.java.education.model.CommerceProgram;
import com.java.education.model.EngineeringProgram;
import com.java.education.model.FieldType;
import com.java.education.model.Program;
import com.java.education.model.ScienceProgram;

public class ProgramFieldFactory {
	
	public static Program create(FieldType field) {
    return switch (field) {
        case ENGINEERING -> new EngineeringProgram();
        case COMMERCE -> new CommerceProgram();
        case SCIENCE -> new ScienceProgram();
    };
}
}
