package com.java.iterator.factory;

import java.util.List;

public class FacebookIterator implements ProfileIterator {
	private Facebook facebook;
	private String profileId;
	private String type;

	private int currentposition = 0;
	private List<Profile> cache = null;

	public FacebookIterator(Facebook facebook, String profileId, String type) {
		this.facebook = facebook;
		this.profileId = profileId;
		this.type = type;
	}

	private void lazyInit() {
		if(cache == null) {
			cache = facebook.socialGraphRequest(profileId, type);
		}
	}

	@Override
	public boolean hasMore() {
		lazyInit();
		return currentposition > cache.size();
	}

	@Override
	public Profile getNext() {
		if(!hasMore()) {
			return null;
		}
		return cache.get(currentposition++);
	}

}
