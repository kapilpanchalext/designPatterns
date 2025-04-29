package com.java.education.service;

import com.java.education.model.Program;

public abstract class AbstractProgramLevel {

  protected abstract Program createProgram();
  protected abstract String getLevelName();
	
	public String enrollProgram() {
		Program program = createProgram();
		String result = "Enrolling in a " + getLevelName() + " program " + program.enroll();
		
		return result;
	}
}
