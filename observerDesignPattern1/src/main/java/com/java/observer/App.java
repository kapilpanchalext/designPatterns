package com.java.observer;

import com.java.observer.factory.Editor;
import com.java.observer.factory.EmailAlertsListener;
import com.java.observer.factory.LoggingListener;

public class App {
    public static void main(String[] args) {
        System.out.println("Observer Design Pattern!");
        
        Editor editor = new Editor();
        LoggingListener logger = new LoggingListener("path/to/log/text", "Someone has opened the file %s");
        editor.events.subscribe("open", logger);
        
        EmailAlertsListener emailAlerts = new EmailAlertsListener("admin@example.com", "Someone has changed the file: %s");
        editor.events.subscribe("save", emailAlerts);
        
        editor.openFile("demo.txt");
        editor.saveFile();
    }
}
