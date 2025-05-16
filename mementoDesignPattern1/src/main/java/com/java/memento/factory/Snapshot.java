package com.java.memento.factory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Snapshot {
	private final Editor editor;
	private final String text;
	private final int curX, curY;
	private final int selectionWidth;
	
	public void restore() {
		editor.setText(text);
		editor.setCursor(curX, curY);
		editor.setSelectionWidth(selectionWidth);
	}
}
