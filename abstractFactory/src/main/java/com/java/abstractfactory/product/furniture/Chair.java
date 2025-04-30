package com.java.abstractfactory.product.furniture;

import com.java.abstractfactory.product.Product;

public class Chair implements Product {

	@Override
	public String getName() {
		return "Chair";
	}

	@Override
	public double getPrice() {
		return 89.99;
	}

}
