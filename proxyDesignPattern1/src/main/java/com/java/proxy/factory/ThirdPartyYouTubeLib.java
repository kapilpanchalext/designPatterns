package com.java.proxy.factory;

public interface ThirdPartyYouTubeLib {

	String listVideos();
	String getVideoInfo(String id);
	void downloadVideo(String id);
}
