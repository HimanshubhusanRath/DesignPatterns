package com.hr.actualcomponent;

import java.awt.Color;
import java.awt.Graphics;

import com.hr.flyweightcomponent.TreeType;

public class Tree {

	// coordinates for drawing the tree
	private int x;
	private int y;
	private TreeType type;
	
	public Tree(int x, int y, TreeType type) {
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(x-1, y, 3, 5);
		g.setColor(type.getColor());
		g.fillOval(x-5, y-10, 10, 10);
		
	}
}
