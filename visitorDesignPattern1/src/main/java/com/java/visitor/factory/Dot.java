package com.java.visitor.factory;

public class Dot implements Shape {
	private int id;
	private int x;
	private int y;

	public Dot(int id, int x, int y) {
		this.id = id;
		this.x = x;
		this.y = y;
	}

	public int getId() {
		return id;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Dot At: ("+ x + ", " + y +")");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
