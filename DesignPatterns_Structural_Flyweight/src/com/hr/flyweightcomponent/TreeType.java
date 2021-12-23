package com.hr.flyweightcomponent;

import java.awt.Color;

public final class TreeType {

	private Color color;
	private String name;
	
	public TreeType(Color color, String name) {
		this.color = color;
		this.name = name;
	}

	public Color getColor() {
		return color;
	}
	
	public String getName() {
		return name;
	}
	
}
