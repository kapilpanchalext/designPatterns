package com.java.mediator;

import com.java.mediator.factory.AuthenticationDialog;

public class App {
	public static void main(String[] args) {
		System.out.println("Mediator Design Pattern!");
		
		AuthenticationDialog dialog = new AuthenticationDialog();
		
		System.err.println("\n --- Login Flow --- \n");
		dialog.getLoginRegistrationCheckbox().toggle();
		dialog.getLoginUsername().setText("user");
		dialog.getLoginPassword().setText("pass");
		dialog.getOkBtn().click();
		
		System.err.println("\n --- Registration Flow --- \n");
		dialog.getLoginRegistrationCheckbox().toggle();
		dialog.getRegistrationUsername().setText("newuser");
		dialog.getRegistrationPassword().setText("newpass");
		dialog.getRegistrationEmail().setText("new@example.com");
		dialog.getOkBtn().click();
	}
}
