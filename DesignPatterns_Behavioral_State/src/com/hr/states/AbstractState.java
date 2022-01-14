package com.hr.states;

import com.hr.context.MobilePhone;

public abstract class AbstractState {

	private MobilePhone mobilePhone;
	
	public MobilePhone getMobilePhone()
	{
		return this.mobilePhone;
	}
	
	public void setMobilePhone(final MobilePhone mobilePhone)
	{
		this.mobilePhone = mobilePhone;
	}
	
	public abstract void makeCall();
	public abstract void pressAnyKey();
}
