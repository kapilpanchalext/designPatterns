package com.java.factory.logistics;

import com.java.factory.transport.Transport;
import com.java.factory.transport.Truck;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RoadLogistics extends Logistics{

	@Override
	public Transport createTransport() {
		log.info("Create Road Transport");
		return new Truck();
	}
}
