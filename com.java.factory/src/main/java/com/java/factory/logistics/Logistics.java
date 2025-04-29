package com.java.factory.logistics;

import com.java.factory.transport.Transport;

public abstract class Logistics {

	public abstract Transport createTransport();
	
	public void planDelivery() {
		Transport transport = createTransport();
		transport.deliver();
	}
}
