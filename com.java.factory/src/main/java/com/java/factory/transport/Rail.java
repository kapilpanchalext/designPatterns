package com.java.factory.transport;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rail implements Transport{

	@Override
	public void deliver() {
		log.info("Delivering by Rail in a train.");
	}
}
