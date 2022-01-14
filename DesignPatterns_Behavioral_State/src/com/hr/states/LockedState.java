package com.hr.states;

public class LockedState extends AbstractState{

	@Override
	public void makeCall() {
		System.out.println("Can not make call as the phone is locked !!");
	}
	
	@Override
	public void pressAnyKey() {
		System.out.println("Can not press the key as the phone is locked !!");
	}
}
