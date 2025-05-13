package com.java.command.factory;


public class CopyCommand extends Command{
	
	public CopyCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override	
	public boolean execute() {
		app.clipboard = editor.getSelection();
		System.out.println("Copied: " + app.clipboard);
		return false;
	}

}
