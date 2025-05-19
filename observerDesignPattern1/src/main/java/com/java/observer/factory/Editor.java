package com.java.observer.factory;

import java.io.File;

public class Editor {
	public EventManager events;
	public File file;

	public Editor() {
		this.events = new EventManager();
	}
	
	public void openFile(String path) {
		this.file = new File(path);
		events.notify("open", file.getName());
	}
	
	public void saveFile() {
		events.notify("save", file.getName());
	}
}
