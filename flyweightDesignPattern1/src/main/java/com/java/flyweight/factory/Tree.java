package com.java.flyweight.factory;

import java.awt.Graphics;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Tree {
	private final int x;
	private final int y;
	private final TreeType type;
	
	public void draw(Graphics g) {
		type.draw(g, x, y);
	}
}
