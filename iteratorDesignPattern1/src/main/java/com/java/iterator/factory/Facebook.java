package com.java.iterator.factory;

import java.util.List;

public class Facebook implements SocialNetwork {

	@Override
	public ProfileIterator createFriendsIterator(String profileId) {
		return new FacebookIterator(this, profileId, "friends");
	}

	@Override
	public ProfileIterator createCoworkersIterator(String profileId) {
		return new FacebookIterator(this, profileId, "coworkers");
	}

//✅ Add this method with some dummy data for testing
  public List<Profile> socialGraphRequest(String profileId, String type) {
      System.out.println("Fetching " + type + " list for " + profileId);

      // Just return a static list for testing
      if (type.equals("friends")) {
          return List.of(
              new Profile("friend1@email.com"),
              new Profile("friend2@email.com")
          );
      } else if (type.equals("coworkers")) {
          return List.of(
              new Profile("coworker1@email.com"),
              new Profile("coworker2@email.com")
          );
      }

      return List.of(); // Return empty if type doesn't match
  }
}
