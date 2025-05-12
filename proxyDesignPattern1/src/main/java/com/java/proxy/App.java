package com.java.proxy;

import com.java.proxy.factory.CachedYouTubeClass;
import com.java.proxy.factory.ThirdPartyYouTubeClass;
import com.java.proxy.factory.ThirdPartyYouTubeLib;
import com.java.proxy.factory.YouTubeManager;

public class App {
	public static void main(String[] args) {
		System.out.println("Proxy Design Pattern!");

		ThirdPartyYouTubeLib realService = new ThirdPartyYouTubeClass();
		
		ThirdPartyYouTubeLib proxy = new CachedYouTubeClass(realService);
		
		YouTubeManager manager = new YouTubeManager(proxy);
		
		// First User Interaction
		System.out.println("\\n--- First User Interaction ---");
		manager.reactOnUserInput();
		
		System.out.println("\\n--- Second User Interaction ---");
		manager.reactOnUserInput();
	}
}
