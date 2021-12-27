package com.hr.entities;

public class Fan {

	private boolean active = false;

	public boolean isActive()
	{
		return this.active;
	}
	
	public void powerOn()
	{
		this.active = true;
		System.out.println("Fan is ON");
	}
	
	public void powerOff()
	{
		this.active = false;
		System.out.println("Fan is OFF");
	}
}
