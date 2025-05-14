package com.java.iterator;

import com.java.iterator.factory.Facebook;
import com.java.iterator.factory.Profile;
import com.java.iterator.factory.ProfileIterator;
import com.java.iterator.factory.SocialNetwork;
import com.java.iterator.factory.SocialSpammer;

public class App {
	private SocialNetwork network;
	private SocialSpammer spammer;
	
	public void config(String networkType) {
		if(networkType.equalsIgnoreCase("facebook")) {
			this.network=new Facebook();
		}
		this.spammer=new SocialSpammer();
	}
	
	public void sendSpamToFriends(Profile profile) {
		ProfileIterator iterator = network.createFriendsIterator(profile.getEmail());
		spammer.send(iterator, "Hey friend! Important Message.");
	}
	
	public void sendSpamToCoworkers(Profile profile) {
		ProfileIterator iterator = network.createCoworkersIterator(profile.getEmail());
		spammer.send(iterator, "Hey coworker! Important update.");
	}
	
	public static void main(String[] args) {
		System.out.println("Iterator Design Pattern!");
		
		App app = new App();
		app.config("facebook");
		
		Profile testProfile = new Profile("email@email.com");
		
		app.sendSpamToFriends(testProfile);
		app.sendSpamToCoworkers(testProfile);
	}
}
