package com.hr.service;

public class ActualInternet implements Internet{

	public void connect(final String host) throws Exception
	{
		System.out.println("Connected to "+host);
	}
}
