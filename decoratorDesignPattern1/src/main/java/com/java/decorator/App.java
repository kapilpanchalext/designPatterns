package com.java.decorator;

import com.java.decorator.factory.Coffee;
import com.java.decorator.factory.MilkDecorator;
import com.java.decorator.factory.SimpleCoffee;
import com.java.decorator.factory.SugarDecorator;
import com.java.decorator.factory.WhipDecorator;

public class App {
	public static void main(String[] args) {
		System.out.println("Decorator Design Pattern!");

		Coffee order = new SimpleCoffee();
		order = new MilkDecorator(order);
		order = new SugarDecorator(order);
		order = new WhipDecorator(order);

		System.out.println("Order: " + order.getDescription());
		System.out.println("Total Cost: " + order.getCost());
	}
}
