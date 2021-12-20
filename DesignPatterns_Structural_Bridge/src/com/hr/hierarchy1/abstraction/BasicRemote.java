package com.hr.hierarchy1.abstraction;

import com.hr.hierarchy2.implementation.Device;

public class BasicRemote implements Remote{

	private Device device;
	
	public BasicRemote(final Device device)
	{
		this.device = device;
	}
	
	@Override
	public void switchOn() {
		this.device.powerOn();
	}
	
	@Override
	public void switchOff() {
		this.device.powerOff();
	}
	
	@Override
	public void volumeUp() {
		this.device.increaseVolume();
	}
	
	@Override
	public void volumeDown() {
		this.device.decreaseVolume();
	}
}
