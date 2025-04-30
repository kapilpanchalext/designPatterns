package com.java.builderpattern.factory;

public class ProductBuilder {

	private String partA;
	private String partB;

	public ProductBuilder setPartA(String partA){
		this.partA=partA;
		return this;
	}

	public ProductBuilder setPartB(String partB){
		this.partB=partB;
		return this;
	}

	public Product build() {
		Product product = new Product();
		product.setPartA(partA);
		product.setPartB(partB);
		return product;
	}

}
