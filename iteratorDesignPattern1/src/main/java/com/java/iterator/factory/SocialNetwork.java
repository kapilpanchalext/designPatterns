package com.java.iterator.factory;

public interface SocialNetwork {

	ProfileIterator createFriendsIterator(String profileId);
	ProfileIterator createCoworkersIterator(String profileId);
}
