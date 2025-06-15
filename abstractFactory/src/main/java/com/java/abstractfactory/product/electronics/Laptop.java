package com.java.abstractfactory.product.electronics;

import com.java.abstractfactory.product.Product;

public class Laptop implements Product {

	/**
	 * @param no parameters
	 * @return String
	 * */
	@Override
	public String getName() {
		return "Laptop";
	}

	@Override
	public double getPrice() {
		return 1299.99;
	}

}
