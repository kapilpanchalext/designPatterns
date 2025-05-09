package com.java.flyweight;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import com.java.flyweight.factory.Forest;
import com.java.flyweight.factory.ForestPanel;

public class App {
	public static void main(String[] args) {
		System.out.println("Flyweight Design Pattern!");
		
		JFrame frame = new JFrame("Flyweight Pattern: Forest");
		Forest forest = new Forest();
		
		Image dummyTexture = Toolkit.getDefaultToolkit().createImage("tree.png");
		
		dummyTexture = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
		Graphics g = dummyTexture.getGraphics();
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, 10, 10);
		
		for(int i=0; i<10000; i++) {
			forest.plantTree((i%1000), (i/1000)*15, "Oak", Color.GREEN, dummyTexture);
		}
		
		ForestPanel forestPanel = new ForestPanel(forest);
		
		forestPanel.setPreferredSize(new Dimension(1000, 500));
		
		frame.add(new JScrollPane(forestPanel));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
