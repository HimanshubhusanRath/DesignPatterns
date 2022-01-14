package com.hr.states;

public class ActiveState extends AbstractState{

	@Override
	public void makeCall() {
		System.out.println("Making the call now..");
	}
	
	@Override
	public void pressAnyKey() {
		System.out.println("Key is pressed now..");
	}
}
