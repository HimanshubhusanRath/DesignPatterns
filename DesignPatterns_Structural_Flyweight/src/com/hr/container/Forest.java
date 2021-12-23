package com.hr.container;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import com.hr.actualcomponent.Tree;
import com.hr.flyweightcomponent.TreeType;
import com.hr.flyweightcomponent.TreeTypeFactory;

public class Forest extends JFrame{

	private List<Tree> trees = new ArrayList<>();
	
	public void plantTree(final int xloc, final int yloc, final String name, final Color color)
	{
		final TreeType type = TreeTypeFactory.getTreeType(color, name);
		trees.add(new Tree(xloc, yloc, type));
	}
	
	@Override
	public void paint(Graphics g) {
		for(Tree tree: trees)
		{
			tree.draw(g);
		}
	}
	
}
