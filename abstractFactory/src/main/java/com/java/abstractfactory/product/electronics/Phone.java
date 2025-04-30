package com.java.abstractfactory.product.electronics;

import com.java.abstractfactory.product.Product;

public class Phone implements Product {

	@Override
	public String getName() {
		return "Smart Phone";
	}

	@Override
	public double getPrice() {
		return 699.99;
	}

}
