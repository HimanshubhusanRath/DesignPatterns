package com.hr.singleton;

public class GovernmentOfIndia {

	private static GovernmentOfIndia instance;
	
	private GovernmentOfIndia() 
	{
	
	}

	public static GovernmentOfIndia getInstance()
	{
		if(null==instance)
		{
			synchronized (instance) {
				if(instance==null)
				{
					instance = new GovernmentOfIndia();
				}		
			}
		}
		return instance;
	}
	
	
}
