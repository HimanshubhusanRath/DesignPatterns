package com.hr.entities;

import com.hr.mediator.Mediator;

public class Switch {

	private Mediator mediator;
	
	public void setMediator(final Mediator mediator)
	{
		this.mediator = mediator;
	}
	
	public void press()
	{
		this.mediator.press();
	}
}
