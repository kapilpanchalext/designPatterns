package com.java.abstractfactory.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractOtherAnimal implements Animal{

	@Override
	public void sleep() {
		log.info("Abstract Other Animal Implementation");
	}
}
