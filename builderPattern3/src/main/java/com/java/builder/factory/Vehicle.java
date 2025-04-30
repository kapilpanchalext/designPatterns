package com.java.builder.factory;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class Vehicle {
	private String engine;
	private int wheels;
	private boolean hasGps;
	
	
	
	public static class Builder{
		private String engine;
		private int wheels;
		private boolean hasGPS;
		
		public Builder setEngine(String engine) {
			this.engine=engine;
			return this;
		}
		
		public Builder setWheels(int wheels) {
			this.wheels=wheels;
			return this;
		}
		
		public Builder setGPS(boolean hasGPS) {
			this.hasGPS=hasGPS;
			return this;
		}
		
		public Vehicle build() {
			Vehicle v = new Vehicle();
			v.engine=this.engine;
			v.wheels=this.wheels;
			v.hasGps=this.hasGPS;
			return v;
		}
	}
}
