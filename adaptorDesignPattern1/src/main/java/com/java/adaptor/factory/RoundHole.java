package com.java.adaptor.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoundHole {
	private double radius;
	
	public boolean fits(RoundPeg peg) {
		return this.radius >= peg.getRadius();
	}
}
