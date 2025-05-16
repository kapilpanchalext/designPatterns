package com.java.memento;

import com.java.memento.factory.Command;
import com.java.memento.factory.Editor;

public class App {
	public static void main(String[] args) {
		System.out.println("Memento Design Pattern - Multilevel Undo");
		
		Editor editor = new Editor();
		
		Command command = new Command(editor);
		
		editor.setText("Version 1");
		command.makeBackup();
		
		editor.setText("Version 2");
		command.makeBackup();
		
		editor.setText("Version 3");
		command.makeBackup();
		
		System.out.println("Current: " + editor.getText());
		
		command.undo();
		System.out.println("Undo 1: " + editor.getText());
		
		command.undo();
		System.out.println("Undo 2: " + editor.getText());
		
		command.undo();
		System.out.println("Undo 3: " + editor.getText());
	}
}
