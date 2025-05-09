package com.java.flyweight.factory;

import java.awt.Color;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
	private static final Map<String, TreeType> treeTypes = new HashMap<>();
	
	public static TreeType getTreeType(String name, Color color, Image texture) {
    String key = name + color.toString();  // Use name and color as the key
    return treeTypes.computeIfAbsent(key, k -> new TreeType(name, color, texture));
	}
}
