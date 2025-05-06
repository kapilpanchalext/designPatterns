package com.java.bridge;

import com.java.bridge.factory.FileTask;
import com.java.bridge.factory.MultiThreadExecution;
import com.java.bridge.factory.NetworkTask;
import com.java.bridge.factory.SingleThreadExecution;
import com.java.bridge.factory.Task;

public class App {
	public static void main(String[] args) {
		System.out.println("Bridge Pattern Example");

		// Create a task with single thread execution strategy
		Task task1 = new FileTask(new SingleThreadExecution());
		Task task2 = new NetworkTask(new MultiThreadExecution());
		
		task1.run();
		task2.run();
	}
}
