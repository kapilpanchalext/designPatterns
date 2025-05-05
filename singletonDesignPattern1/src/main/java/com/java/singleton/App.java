package com.java.singleton;

import com.java.singleton.factory.Database;

public class App {
    public static void main(String[] args) {
        System.out.println("Singleton Factory Design Pattern!");

        Database foo = Database.getInstance();
        foo.query("SELECT * FROM users;");
        String val1 = foo.getVal();
        System.out.println(val1);

        Database bar = Database.getInstance();
        bar.query("SELECT * FROM products;");
        String val2 = bar.getVal();
        System.out.println(val2);

        System.err.println("Same Instance: " + (foo == bar));
    }
}
