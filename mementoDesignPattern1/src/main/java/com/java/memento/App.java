package com.java.memento;

import com.java.memento.factory.Command;
import com.java.memento.factory.Editor;

public class App {
	public static void main(String[] args) {
		System.out.println("Memento Design Pattern!");

		Editor editor = new Editor();
		Command command = new Command(editor);

		editor.setText("Original Text");
		editor.setCursor(0, 0);
		editor.setSelectionWidth(0);
		
		System.out.println("Before Change: " + editor.getText());
		
		command.execute("Modified Text");
		System.out.println("After Change: " + editor.getText());
		
		command.undo();
		System.out.println("After Undo: " + editor.getText());
	}
}
