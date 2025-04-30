package com.java.education.service.factory;

public class PhDProgram extends AbstractProgram{

	public PhDProgram(String field) {
		super(field);
	}

	@Override
	public int getDuration() {
		return 5;
	}

	@Override
	public double getFees() {
		return 20000 * getDuration();
	}

	@Override
	public boolean isEligible(int age, double gpa) {
		return age >= 25 && gpa >= 3.5;
	}

}
