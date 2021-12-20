package com.hr.client;

import com.hr.hierarchy1.abstraction.BasicRemote;
import com.hr.hierarchy1.abstraction.Remote;
import com.hr.hierarchy2.implementation.Radio;
import com.hr.hierarchy2.implementation.TV;

public class BridgeClient {

	public static void main(String[] args) {
		TV tv = new TV();
		Radio radio = new Radio();
		
		Remote tvRemote = new BasicRemote(tv);
		Remote radioRemote = new BasicRemote(radio);
		
		// Operate on TV
		tvRemote.switchOn();
		tvRemote.volumeUp();
		tv.showStatus();
		
		tvRemote.volumeUp();
		tv.showStatus();
		
		// Operate on RADIO
		radioRemote.switchOn();
		radioRemote.volumeDown();
		radio.showStatus();
		
		radioRemote.volumeDown();
		radio.showStatus();
		
	}
}
