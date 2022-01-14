package com.hr.context;

import com.hr.states.AbstractState;

public class MobilePhone {

	private AbstractState state;
	
	public MobilePhone(final AbstractState state)
	{
		this.state = state;
	}
	
	public void setState(final AbstractState state)
	{
		this.state = state;
	}
	
	/* Public methods */
	public void makeCall()
	{
		this.state.makeCall();
	}
	
	public void pressAnyKey()
	{
		this.state.pressAnyKey();
	}
	
}
