package com.java.composite.factory;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape implements Shape{
	private List<Shape> children = new ArrayList<>();

	public void add(Shape shape) {
		children.add(shape);
	}

	public void remove(Shape shape) {
		children.remove(shape);
	}

	@Override
	public void draw() {
		System.out.println("Drawing Composite Shape: ");
		for(Shape shape : children) {
			shape.draw();
		}
	}

	@Override
	public void move(int dx, int dy) {
		for(Shape shape : children) {
			shape.move(dx, dy);
		}
	}

}
