package com.java.composite.factory;

public class Circle extends BaseShape{
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle at (" + x + ", " + y + ") with radius " + radius);
	}

}
