package com.java.mediator.factory;

public class Checkbox extends Component{
	private boolean checked;

	public Checkbox(Mediator mediator) {
		super(mediator);
	}

	public void check() {
		this.checked = !checked;
		mediator.notify(this, "check");
	}
	
	public void uncheck() {
		checked=false;
		mediator.notify(this, "check");
	}
	
	public void toggle() {
		checked=!checked;
		mediator.notify(this, "check");
	}

	public boolean isChecked() {
		return checked;
	}
}
