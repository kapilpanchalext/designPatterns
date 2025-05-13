package com.java.command.factory;

import java.util.Stack;

public class CommandHistory {

	private Stack<Command> history = new Stack<>();
	
	public void push(Command c) {
		history.push(c);
	}
	
	public Command pop() {
		return history.isEmpty() ? null : history.pop();
	}
}
