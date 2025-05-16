package com.java.memento.factory;

import lombok.Data;

@Data
public class Editor {
	private String text;
	private int curX, curY;
	private int selectionWidth;

	public void setCursor(int x, int y) {
		this.curX=x;
		this.curY=y;
	}

	public Snapshot createSnapshot() {
		return new Snapshot(this, text, curX, curY, selectionWidth);
	}
}
