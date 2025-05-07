package com.java.composite.factory;

public class Triangle extends BaseShape{

	public Triangle(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw() {
		System.out.println("Drawing Triangle at (" + x + ", " + y + ")");
	}

}
