package com.java.builderpattern.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bike implements Vehicle {

	@Override
	public void drive() {
		log.info("Inside Bike Drive");
	}

}
