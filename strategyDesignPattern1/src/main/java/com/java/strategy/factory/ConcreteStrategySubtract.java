package com.java.strategy.factory;

public class ConcreteStrategySubtract implements Strategy {

	@Override
	public int execute(int a, int b) {
		return a-b;
	}

}
