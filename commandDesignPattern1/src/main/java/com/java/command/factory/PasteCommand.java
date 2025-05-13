package com.java.command.factory;

public class PasteCommand extends Command{

	public PasteCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public boolean execute() {
		saveBackup();
		editor.replaceSelection(app.clipboard);
		System.out.println("Pasted From Clipboard.");
		return true;
	}

}
