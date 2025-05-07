package com.java.composite.factory;

public abstract class BaseShape implements Shape {
	protected int x, y;
	
	public BaseShape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	@Override
	public abstract void draw();

}
