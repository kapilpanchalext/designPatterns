package com.java.abstractfactory.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractAnimal implements Animal {

	@Override
	public void sleep() {
		log.info("Original Abstract Animal Sleep");
		
	}

	@Override
	public void eat() {
		log.info("Abstract Animal Eat");
	}

}
