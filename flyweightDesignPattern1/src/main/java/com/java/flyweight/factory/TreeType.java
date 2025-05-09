package com.java.flyweight.factory;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TreeType {
	private final String name;
	private final Color color;
	private final Image texture;
	
	public void draw(Graphics g, int x, int y) {
		g.setColor(color);
		g.drawImage(texture, x, y, null);
		System.out.printf("Drawing tree [%s] at (%d, %d)%n", name, x, y);
	}
}
