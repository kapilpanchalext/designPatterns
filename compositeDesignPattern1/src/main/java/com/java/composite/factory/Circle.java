package com.java.composite.factory;

public class Circle extends Dot{
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public void draw() {
		System.out.println("Circle: " + x + ", " + y + ", radius: " + radius);
	}

}
