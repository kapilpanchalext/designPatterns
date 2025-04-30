package com.java.education.service.factory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractProgram {

	protected final String field;
	
	public abstract int getDuration();
	public abstract double getFees();
	public abstract boolean isEligible(int age, double gpa);
	
	public String getProgramDetails() {
		return "Program: " + this.getClass().getSimpleName()
				+ ", Field: " + field
				+ ", Duration: " + getDuration() + " years"
				+ ", Fees: " + getFees();
	}
}
