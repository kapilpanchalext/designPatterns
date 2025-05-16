package com.java.memento.factory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Command {
	private Snapshot backup;
	private final Editor editor;

	public void makeBackup() {
		backup = editor.createSnapshot();
	}

	public void undo() {
		if(backup != null) {
			backup.restore();
		}
	}

	public void execute(String newText) {
		makeBackup();
		editor.setText(newText);
	}
}
