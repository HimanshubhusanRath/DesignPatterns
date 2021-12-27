package com.hr.mediator;

import com.hr.entities.Fan;
import com.hr.entities.Switch;

public class ElectricCircuitMediator implements Mediator{

	private Switch switchh;
	private Fan fan;
	
	public void addSwitch(final Switch switchh)
	{
		this.switchh = switchh;
		// Set the mediator in the switch
		this.switchh.setMediator(this);
	}
	
	public void addFan(final Fan fan)
	{
		this.fan = fan;
	}
	
	@Override
	public void press() {
		if(fan.isActive())
		{
			fan.powerOff();
		}
		else
		{
			fan.powerOn();
		}
	}
	
}
