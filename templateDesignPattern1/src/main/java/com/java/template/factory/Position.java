package com.java.template.factory;

public class Position {
	private final String name;
	
	public Position(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Position [name=" + name + "]";
	}
}
