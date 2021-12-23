package com.hr.proxy;

import java.util.ArrayList;
import java.util.List;

import com.hr.service.ActualInternet;
import com.hr.service.Internet;

public class InternetProxy implements Internet{

	private Internet internet = new ActualInternet();
	private static List<String> bannedHosts = new ArrayList<>();
	
	static
	{
		bannedHosts.add("www.freegames.com");
		bannedHosts.add("www.onlinegames.com");
	}
	
	@Override
	public void connect(String host) throws Exception{
		
		// Check access restrictions
		if(bannedHosts.contains(host))
		{
			throw new Exception("Access Denied to this site");
		}
		// Delegates to the actual service
		System.out.println("Connecting to : "+host);
		internet.connect(host);
	}
}
