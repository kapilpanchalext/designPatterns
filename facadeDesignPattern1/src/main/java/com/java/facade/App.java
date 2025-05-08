package com.java.facade;

import java.io.File;

import com.java.facade.factory.VideoConverter;

public class App {
    public static void main(String[] args) {
        System.out.println("Facade Design Pattern!");
        
        // Create a new Facade object
        VideoConverter converter = new VideoConverter();
        File mp4Video = converter.convert("HelloWorldVideo.ogg", "mp4");
        
        System.out.println("Video Saved as: " + mp4Video.getName());
    }
}
