package com.java.abstractfactory.factory;

import com.java.abstractfactory.product.Product;
import com.java.abstractfactory.product.furniture.Chair;
import com.java.abstractfactory.product.furniture.Table;

public class FurnitureFactory implements ProductFactory {

	@Override
	public Product createPrimaryProduct() {
		return new Chair();
	}

	@Override
	public Product createSecondaryProduct() {
		return new Table();
	}

}
