package com.java.factory.logistics;

import com.java.factory.transport.Rail;
import com.java.factory.transport.Transport;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RailLogistics extends Logistics {
	@Override

	public Transport createTransport() {
		log.info("Create Rail Transport");
		return new Rail();
	}

}
