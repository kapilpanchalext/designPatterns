package com.java.command.factory;

public class Application {

	public String clipboard;
	public Editor editor;
	private CommandHistory history = new CommandHistory();

	public Application(Editor editor) {
		this.editor = editor;
	}

	public void executeCommand(Command command) {
		if(command.execute()) {
			history.push(command);
		}
	}

	public void undo() {
		Command command = history.pop();
		if(command != null) {
			command.undo();
		}
	}
	
	

}
