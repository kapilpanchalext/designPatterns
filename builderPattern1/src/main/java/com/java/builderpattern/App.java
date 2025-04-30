package com.java.builderpattern;

import com.java.builderpattern.factory.Product;
import com.java.builderpattern.factory.ProductBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        log.info("Builder Design Pattern");
        Product product = new ProductBuilder().setPartA("PartA").setPartB("PartB").build();
        log.info(product.toString());
    }
}
