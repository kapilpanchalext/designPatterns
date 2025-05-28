package com.java.template.factory;

public class Enemy {
	private final Position position;

	public Enemy(Position position) {
		this.position=position;
	}

	public Position getPosition() {
		return position;
	}
}
