package com.hr.flyweightcomponent;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {

	private static Map<String,TreeType> types = new HashMap<String, TreeType>();
	
	public static TreeType getTreeType(final Color color, final String name)
	{
		TreeType result = types.get("name");
		
		if(null==result)
		{
			result = new TreeType(color, name);
			types.put(name, result);
		}
		
		return result;
	}
}
