package com.java.flyweight.factory;

import java.awt.Graphics;

import javax.swing.JPanel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ForestPanel extends JPanel{
	private static final long serialVersionUID = 1576088874830415888L;
	
	private final Forest forest;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		forest.draw(g);
	}
}
