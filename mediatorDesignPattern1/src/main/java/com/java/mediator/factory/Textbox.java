package com.java.mediator.factory;

public class Textbox extends Component{
	private String text = "";

	public Textbox(Mediator mediator) {
		super(mediator);
	}
	
	public void setText(String text) {
		this.text=text;
	}
	
	public String getText() {
		return text;
	}

}
