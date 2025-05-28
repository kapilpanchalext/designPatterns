package com.java.strategy;

import java.util.Scanner;
import com.java.strategy.factory.ConcreteStrategyAdd;
import com.java.strategy.factory.ConcreteStrategyMultiply;
import com.java.strategy.factory.ConcreteStrategySubtract;
import com.java.strategy.factory.Context;

public class App {
    public static void main(String[] args) {
        System.out.println("Strategy Design Pattern!");
        Scanner scanner = new Scanner(System.in);
        Context context = new Context();
        
        System.out.println("Enter First Number: ");
        int a = scanner.nextInt();

        System.err.println("Enter Second Number: ");
        int b = scanner.nextInt();

        System.out.println("Choose Operation(add, subtract, multiply: )");
        String action = scanner.next();

        switch(action.toLowerCase()) {
	        case "add": 
	        	context.setStrategy(new ConcreteStrategyAdd());
	        	break;
	        case "subtract": 
	        	context.setStrategy(new ConcreteStrategySubtract());
	        	break;
	        case "multiply": 
	        	context.setStrategy(new ConcreteStrategyMultiply());
	        	break;
	        default:
	        	System.out.println("Invalid Operation");
	        	scanner.close();
	        	return;
        }

        int result = context.executeStrategy(a, b);
        System.err.println("Result: " + result);
        scanner.close();
    }
}
