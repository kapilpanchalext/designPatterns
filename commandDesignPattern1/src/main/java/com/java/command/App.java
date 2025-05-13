package com.java.command;

import com.java.command.factory.Application;
import com.java.command.factory.CopyCommand;
import com.java.command.factory.CutCommand;
import com.java.command.factory.Editor;
import com.java.command.factory.PasteCommand;
import com.java.command.factory.UndoCommand;

public class App {
    public static void main(String[] args) {
        System.out.println("Command Design Pattern!\n");
        
        Editor editor = new Editor("Hello, Command Pattern!");
        Application app = new Application(editor);
        
        editor.select(7, 14);
        app.executeCommand(new CopyCommand(app, editor));
        
        editor.select(7, 14);
        app.executeCommand(new CutCommand(app, editor));
        editor.show();
        
        editor.select(7, 7);
        app.executeCommand(new PasteCommand(app, editor));
        editor.show();
        
        app.executeCommand(new UndoCommand(app, editor));
        editor.show();
        
        app.executeCommand(new CutCommand(app, editor));
        editor.show();
    }
}
