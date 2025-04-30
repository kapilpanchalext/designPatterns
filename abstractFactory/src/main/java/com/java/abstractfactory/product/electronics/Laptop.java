package com.java.abstractfactory.product.electronics;

import com.java.abstractfactory.product.Product;

public class Laptop implements Product {

	@Override
	public String getName() {
		return "Laptop";
	}

	@Override
	public double getPrice() {
		return 1299.99;
	}

}
