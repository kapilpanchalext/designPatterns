package com.java.abstractfactory.product.furniture;

import com.java.abstractfactory.product.Product;

public class Table implements Product {

	@Override
	public String getName() {
		return "Dining Table";
	}

	@Override
	public double getPrice() {
		return 249.99;
	}

}
