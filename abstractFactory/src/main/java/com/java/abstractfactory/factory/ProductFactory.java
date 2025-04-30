package com.java.abstractfactory.factory;

import com.java.abstractfactory.product.Product;

public interface ProductFactory {
	Product createPrimaryProduct();
	Product createSecondaryProduct();
}
