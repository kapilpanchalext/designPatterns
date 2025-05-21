package com.java.state;

import com.java.state.factory.AudioPlayer;

public class App {
	public static void main(String[] args) {
		System.out.println("State Design Pattern!");
		
		AudioPlayer player = new AudioPlayer();
		
		player.clickPlay();
		player.clickNext();
		player.clickLock();
		player.clickPlay();
		player.clickLock();
		player.clickPlay();
		player.clickPrevious();
	}
}
