package com.java.flyweight.factory;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Forest {
	private final List<Tree> trees = new ArrayList<>();
	
	public void plantTree(int x, int y, String name, Color color, Image texture) {
		TreeType type = TreeFactory.getTreeType(name, color, texture);
		Tree tree = new Tree(x, y, type);
		trees.add(tree);
	}
	
	public void draw(Graphics g) {
		for(Tree tree : trees) {
			tree.draw(g);
		}
	}
}
