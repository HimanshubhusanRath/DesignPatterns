package com.hr.client;

import java.awt.Color;

import com.hr.container.Forest;

public class FlyweightClient {

	private static int TREE_COUNT = 10000000;
	private static int CANVAS_DIMENSION = 500;
	private static int TREE_TYPES = 2;
	
	public static void main(String[] args) 
	{
		Forest forest = new Forest();
		for(int i=0;i<TREE_COUNT/TREE_TYPES;i++)
		{
			forest.plantTree(random(0, CANVAS_DIMENSION), random(0, CANVAS_DIMENSION), "Banyan", Color.ORANGE);
			forest.plantTree(random(0, CANVAS_DIMENSION), random(0, CANVAS_DIMENSION), "Mango", Color.GREEN);
		}
		
		forest.setSize(CANVAS_DIMENSION, CANVAS_DIMENSION);
		forest.setVisible(true);
		
		// Impact
		System.out.println("Impact on memory usage\n==================\n");
		
		System.out.println("----- Without flyweight --------");
		System.out.println("Tree size     : 32 bytes * "+TREE_COUNT);
		System.out.println("RAM used : "+(32 * TREE_COUNT)/1024/1024 + " MB");
		
		System.out.println("----- With flyweight --------");
		System.out.println("TreeType size : ~24 bytes * "+TREE_TYPES);
		System.out.println("Tree size     : 12 bytes * "+TREE_COUNT);
		System.out.println("RAM used : "+((24 * TREE_TYPES) + (12 * TREE_COUNT))/1024/1024 + " MB");
		
		
	}
	
	private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
