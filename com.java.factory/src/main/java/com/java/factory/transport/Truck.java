package com.java.factory.transport;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Truck implements Transport {

	@Override
	public void deliver() {
		log.info("Delivering by land in a truck.");
	}
}
