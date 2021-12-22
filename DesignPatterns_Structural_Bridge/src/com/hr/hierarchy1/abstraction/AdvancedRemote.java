package com.hr.hierarchy1.abstraction;

import com.hr.hierarchy2.implementation.Device;

public class AdvancedRemote extends BasicRemote{

	public AdvancedRemote(final Device device)
	{
		super(device);
	}
	
	public void mute()
	{
		device.setVolume(0);
	}

	
}
