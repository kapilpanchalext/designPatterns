package com.java.abstractfactory.store;

import com.java.abstractfactory.factory.ProductFactory;
import com.java.abstractfactory.product.Product;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class Store {

	private final Product primary;
	private final Product secondary;

  public Store(ProductFactory factory) {
    this.primary = factory.createPrimaryProduct();
    this.secondary = factory.createSecondaryProduct();
  }

	public void displayProducts() {
		log.info("Primary Product: " + primary.getName() + " - $" + primary.getPrice());
		log.info("Secondary Product: " + secondary.getName() + " - $" + secondary.getPrice());
	}

}
