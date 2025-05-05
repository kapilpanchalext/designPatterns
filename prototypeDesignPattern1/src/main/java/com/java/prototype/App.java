package com.java.prototype;

import java.util.ArrayList;
import java.util.List;
import com.java.prototype.factory.Circle;
import com.java.prototype.factory.Rectangle;
import com.java.prototype.factory.Shape;

public class App {
	private List<Shape> shapes = new ArrayList<>();

	public App() {
		Circle circle = new Circle();
		circle.setX(10);
		circle.setY(20);
		circle.setColor("Red");
		circle.setRadius(5);
		shapes.add(circle);

		Circle anotherCircle = (Circle) circle.clone();
		shapes.add(anotherCircle);

		Rectangle rectangle = new Rectangle();
		rectangle.setX(5);
		rectangle.setY(15);
		rectangle.setColor("Blue");
		rectangle = new Rectangle(rectangle);
		rectangle.setWidth(10);
		rectangle.setHeight(20);
		shapes.add(rectangle);
	}

	public void businessLogic() {
		List<Shape> shapesCopy = new ArrayList<>();

		for(Shape s: shapes) {
			shapesCopy.add(s.clone());
		}

		// Print the cloned Shapes
		System.out.println("Original Shapes: ");
		for(Shape s: shapes) {
			System.out.println(s);
		}

		System.out.println("\nCloned Shapes: ");
		for(Shape s: shapesCopy) {
			s.setColor("OtherColor");
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		System.out.println("Prototype Design Pattern - 1");
		App app = new App();
		app.businessLogic();
	}
}
