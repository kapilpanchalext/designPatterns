package com.java.adaptor.factory;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class SquarePegAdaptor extends RoundPeg{

	private SquarePeg squarePeg;

	@Override
	public double getRadius() {
		return squarePeg.getWidth() * Math.sqrt(2)/2;
	}
	
}
