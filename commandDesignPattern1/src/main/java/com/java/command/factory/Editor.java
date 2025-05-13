package com.java.command.factory;

public class Editor {
	private String text;
	private int selectionStart;
	private int selectionEnd;

	public Editor(String text) {
		this.text = text;
		this.selectionStart = 0;
		this.selectionEnd = 0;
	}

	public String saveText() {
		return text;
	}
	
	public String getText() {
		return text;
	}

	public void setText(String value) {
		this.text = value;
	}

	public String getSelection() {
		return text.substring(selectionStart, selectionEnd);
	}

	public void deleteSelection() {
		text = text.substring(0, selectionStart) + text.substring(selectionEnd);
		selectionEnd = selectionStart;
	}

	public void replaceSelection(String replacement) {
		text = text.substring(0, selectionStart) + replacement + text.substring(selectionStart, selectionEnd);
		selectionStart += replacement.length();
		selectionEnd = selectionStart;
	}
	
	public void select(int start, int end) {
		this.selectionStart = start;
		this.selectionEnd = end;
	}
	
	public void show() {
		System.out.println("Editor Content: " + text);
	}

}
