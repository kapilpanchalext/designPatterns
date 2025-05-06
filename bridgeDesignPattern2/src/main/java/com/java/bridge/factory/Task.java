package com.java.bridge.factory;

public abstract class Task {

	protected ExecutionStrategy executionStrategy;
	
	public Task(ExecutionStrategy executionStrategy) {
		this.executionStrategy = executionStrategy;
	}
	
	public abstract void run();
}
