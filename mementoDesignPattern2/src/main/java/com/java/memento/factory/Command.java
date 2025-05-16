package com.java.memento.factory;

import java.util.Stack;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Command {
	private final Stack<Snapshot> history = new Stack<>();
	private final Editor editor;
	
	public void makeBackup() {
		history.push(editor.createSnapshot());
	}
	
	public void undo() {
		if(!history.isEmpty()) {
			Snapshot snapshot = history.pop();
			snapshot.restore();
		} else {
			System.out.println("No more undo steps available!");
		}
	}
	
	public void execute(String newText) {
		makeBackup();
		editor.setText(newText);
	}
}
