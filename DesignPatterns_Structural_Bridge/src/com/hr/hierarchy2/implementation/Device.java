package com.hr.hierarchy2.implementation;

public interface Device {

	void powerOn();

	void powerOff();

	void increaseVolume();

	void decreaseVolume();
	
	void showStatus();
	
	void setVolume(final int vol);

}
