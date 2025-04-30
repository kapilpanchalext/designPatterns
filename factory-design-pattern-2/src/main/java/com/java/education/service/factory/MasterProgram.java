package com.java.education.service.factory;

public class MasterProgram extends AbstractProgram{

	public MasterProgram(String field) {
		super(field);
	}

	@Override
	public int getDuration() {
		return 2;
	}

	@Override
	public double getFees() {
		return 15000 * getDuration();
	}

	@Override
	public boolean isEligible(int age, double gpa) {
		return age >= 22 && gpa >= 3.0;
	}

}
