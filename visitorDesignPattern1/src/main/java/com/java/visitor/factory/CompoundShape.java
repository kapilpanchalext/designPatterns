package com.java.visitor.factory;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
	private int id;
	private List<Shape> children = new ArrayList<>();

	public CompoundShape(int id) {
		this.id = id;
	}

	public void add(Shape shape) {
		children.add(shape);
	}

	public List<Shape> getChildren() {
		return children;
	}

	public int getId() {
		return id;
	}

	@Override
	public void move(int x, int y) {
		for(Shape child : children) {
			child.move(x, y);
		}
	}

	@Override
	public void draw() {
		System.out.println("Drawing Compound Shape With ID: " + id);
		for(Shape child : children) {
			child.draw();
		}
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitCompoundShape(this);
	}

}
