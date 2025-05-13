package com.java.command.factory;

public class CutCommand extends Command{

	public CutCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public boolean execute() {
		saveBackup();
		app.clipboard = editor.getSelection();
		editor.deleteSelection();
		System.out.println("Cut to Clipboard: " + app.clipboard);
		return true;
	}

}
