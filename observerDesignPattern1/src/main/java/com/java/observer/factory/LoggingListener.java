package com.java.observer.factory;

import java.io.File;

public class LoggingListener implements EventListener {
	private File log;
	private String message;

	public LoggingListener(String logFilePath, String message) {
		this.log = new File(logFilePath);
		this.message = message;
	}

	@Override
	public void update(String filename) {
		System.out.println("Log: " + message.replace("%s", filename));
	}

}
