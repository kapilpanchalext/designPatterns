package com.java.builder.factory;

public class VehicleFactory {
	public static Vehicle.Builder createCarBuilder(){
		return new Vehicle.Builder().setEngine("Petrol").setWheels(4);
	}
}
