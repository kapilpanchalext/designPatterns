package com.java.abstractfactory.factory;

import com.java.abstractfactory.product.Product;
import com.java.abstractfactory.product.electronics.Laptop;
import com.java.abstractfactory.product.electronics.Phone;

public class ElectronicsFactory implements ProductFactory {

	@Override
	public Product createPrimaryProduct() {
		return new Phone();
	}

	@Override
	public Product createSecondaryProduct() {
		return new Laptop();
	}

}
