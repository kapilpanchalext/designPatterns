package com.java.mediator.factory;

public abstract class Component {
	protected Mediator mediator;

	public Component(Mediator mediator) {
		this.mediator=mediator;
	}
	
	public void click() {
		mediator.notify(this,"click");
	}
	
	public void keypress() {
		mediator.notify(this, "keypress");
	}
}
