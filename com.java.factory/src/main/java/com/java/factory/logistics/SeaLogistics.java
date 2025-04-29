package com.java.factory.logistics;

import com.java.factory.transport.Ship;
import com.java.factory.transport.Transport;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SeaLogistics extends Logistics{

	@Override
	public Transport createTransport() {
		log.info("Create Ship Transport.");
		return new Ship();
	}
}
