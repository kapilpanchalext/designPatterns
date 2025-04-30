package com.java.abstractfactory;

import com.java.abstractfactory.factory.ElectronicsFactory;
import com.java.abstractfactory.factory.FurnitureFactory;
import com.java.abstractfactory.factory.ProductFactory;
import com.java.abstractfactory.store.Store;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        log.info("Abstract Factory Pattern");

        ProductFactory factory;

        String category = "furniture";

        if(category.equalsIgnoreCase("electronics")) {
        	factory = new ElectronicsFactory();
        } else {
        	factory = new FurnitureFactory();
        }

        Store store = new Store(factory);
        store.displayProducts();
    }
}
