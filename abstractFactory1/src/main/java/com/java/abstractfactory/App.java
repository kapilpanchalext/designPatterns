package com.java.abstractfactory;

import com.java.abstractfactory.factory.Dog;

public class App {
    public static void main(String[] args) {
    	Dog dog = new Dog();
      dog.eat();
      dog.sleep();
    }
}
