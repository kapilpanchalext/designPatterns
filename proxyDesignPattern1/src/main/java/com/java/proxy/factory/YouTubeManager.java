package com.java.proxy.factory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class YouTubeManager {
	private final ThirdPartyYouTubeLib service;

	public void renderVideoPage(String id) {
		String info = service.getVideoInfo(id);
		System.out.println("Rendering video page: " + info);
	}
	
	public void renderListPanel() {
		String list = service.listVideos();
		System.out.println("Rendering video list: " + list);
	}
	
	public void reactOnUserInput() {
		renderListPanel();
		renderVideoPage("Video1");
	}
}
