package com.hr.client;

import com.hr.hierarchy1.abstraction.AdvancedRemote;
import com.hr.hierarchy1.abstraction.BasicRemote;
import com.hr.hierarchy2.implementation.Device;
import com.hr.hierarchy2.implementation.Radio;
import com.hr.hierarchy2.implementation.TV;

public class BridgeClient {

	public static void main(String[] args) {
		TV tv = new TV();
		Radio radio = new Radio();
		
		testRemote(tv);
		testRemote(radio);
		
	}

	private static void testRemote(final Device device) {
		System.out.println("Testing with Basic Remote");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.switchOn();
		basicRemote.volumeDown();
		device.showStatus();
		
		System.out.println("Testing with Advanced Remote");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.switchOff();
		advancedRemote.mute();
		device.showStatus();
	}
}
