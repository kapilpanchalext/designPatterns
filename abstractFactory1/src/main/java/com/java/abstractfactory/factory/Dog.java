package com.java.abstractfactory.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dog extends AbstractAnimal {

	@Override
	public void sleep() {
		log.info("Concrete Animal Sleep");
	}

}
