package com.java.strategy.factory;

public class ConcreteStrategyAdd implements Strategy {

	@Override
	public int execute(int a, int b) {
		return a + b;
	}

}
