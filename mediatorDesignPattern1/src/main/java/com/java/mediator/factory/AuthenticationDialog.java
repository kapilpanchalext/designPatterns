package com.java.mediator.factory;

public class AuthenticationDialog implements Mediator {
	private String title;
	private Checkbox loginOrRegisterCheckbox;
	private Textbox loginUsername, loginPassword;
	private Textbox registrationUsername, registrationPassword, registrationEmail;
	private Button okBtn, cancelBtn;

	public AuthenticationDialog() {
		this.loginOrRegisterCheckbox = new Checkbox(this);
		this.loginUsername = new Textbox(this);
		this.loginPassword = new Textbox(this);
		this.registrationUsername = new Textbox(this);
		this.registrationPassword = new Textbox(this);
		this.registrationEmail = new Textbox(this);
		this.okBtn = new Button(this);
		this.cancelBtn = new Button(this);
	}

	@Override
	public void notify(Component sender, String event) {
		if(sender == loginOrRegisterCheckbox && event.equals("check")) {
			if(loginOrRegisterCheckbox.isChecked()) {
				title = "Log in";
				System.out.println("Switched to Login Form");
			} else {
				title = "Register";
				System.err.println("Switched to Registration Form");
			}
		}

		if(sender == okBtn && event.equals("click")) {
			if(loginOrRegisterCheckbox.isChecked()) {
				String user = loginUsername.getText();
				String pass = loginUsername.getText();
				boolean found = "user".equalsIgnoreCase(user) && "pass".equalsIgnoreCase(pass);
				if(!found) {
					System.out.println("Login failed: Incorrect credentials!");
				} else {
					System.err.println("Login Successful!");
				}
			} else {
				System.out.println("User registered with: ");
				System.out.println("Username: " + registrationUsername.getText());
				System.out.println("Email: " + registrationEmail.getText());
				System.out.println("Auto-login after registration.");
			}
		}
	}

	public Checkbox getLoginRegistrationCheckbox() {
		return loginOrRegisterCheckbox;
	}

	public Textbox getLoginUsername() {
		return loginUsername;
	}

	public Textbox getLoginPassword() {
		return loginPassword;
	}

	public Textbox getRegistrationUsername() {
		return registrationUsername;
	}

	public Textbox getRegistrationPassword() {
		return registrationPassword;
	}

	public Textbox getRegistrationEmail() {
		return registrationEmail;
	}

	public Button getOkBtn() {
		return okBtn;
	}
}
