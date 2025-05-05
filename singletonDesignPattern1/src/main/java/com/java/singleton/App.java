package com.java.singleton;

import com.java.singleton.factory.Database;

public class App {
    public static void main(String[] args) {
        System.out.println("Singleton Factory Design Pattern!");
        
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM users;");
        
        Database bar = Database.getInstance();
        bar.query("SELECT * FROM products;");
        
        System.err.println("Same Instance: " + (foo == bar));
    }
}
