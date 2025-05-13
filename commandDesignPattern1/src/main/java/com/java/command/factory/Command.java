package com.java.command.factory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Command {
	protected final Application app;
	protected final Editor editor;
	protected String backup;
	
	public void saveBackup() {
		backup = editor.saveText();
	}
	
	public void undo() {
		editor.setText(backup);
	}
	
	public abstract boolean execute();
}
