package com.java.education.service.factory;

public class BachelorProgram extends AbstractProgram{

	public BachelorProgram(String field) {
		super(field);
	}

	@Override
	public int getDuration() {
		return 4;
	}

	@Override
	public double getFees() {
		return 10000 * getDuration();
	}

	@Override
	public boolean isEligible(int age, double gpa) {
		return age >= 17 && gpa >= 2.5;
	}

}
