package com.java.bridge;

import com.java.bridge.pattern.Circle;
import com.java.bridge.pattern.GreenCircle;
import com.java.bridge.pattern.RedCircle;
import com.java.bridge.pattern.Shape;

public class App {
	public static void main(String[] args) {
		System.out.println("Bridge Design Pattern Example");

		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}
