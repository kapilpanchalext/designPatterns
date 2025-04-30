package com.java.education.service;

import org.springframework.stereotype.Service;
import com.java.education.entity.Bachelor;
import com.java.education.entity.Master;
import com.java.education.entity.PhD;
import com.java.education.repository.BachelorRepository;
import com.java.education.repository.MasterRepository;
import com.java.education.repository.PhDRepository;
import com.java.education.service.factory.AbstractProgram;
import com.java.education.service.factory.ProgramFactory;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProgramService {
	private final ProgramFactory programFactory;
	private final BachelorRepository bachelorRepository;
	private final MasterRepository masterRepository;
	private final PhDRepository phdRepository;

	public String createProgram(String level, String field, int age, double gpa) {
		AbstractProgram program = programFactory.getProgram(level, field);
		int duration = program.getDuration();
		double fees = program.getFees();
		boolean eligible = program.isEligible(age, gpa);
		
		if (!eligible) {
			throw new IllegalArgumentException("Not eligible for the program");
		}

		switch (level.toLowerCase()) {
		case "bachelor":
			Bachelor bachelor = new Bachelor();
			bachelor.setField(field);
			bachelor.setDuration(duration);
			bachelor.setFees(fees);
			bachelorRepository.save(bachelor);
			return program.getProgramDetails();
		case "master":
			Master master = new Master();
			master.setField(field);
			master.setDuration(duration);
			master.setFees(fees);
			masterRepository.save(master);
			return program.getProgramDetails();
		case "phd":
			PhD phd = new PhD();
			phd.setField(field);
			phd.setDuration(duration);
			phd.setFees(fees);
			phdRepository.save(phd);
			return program.getProgramDetails();
		default:
			throw new IllegalArgumentException("Invalid program level: " + level);
		}
	}
}
