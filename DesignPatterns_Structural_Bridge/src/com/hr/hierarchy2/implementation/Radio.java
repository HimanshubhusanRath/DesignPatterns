package com.hr.hierarchy2.implementation;

public class Radio implements Device{

	private int volume = 2;
	private boolean active = false;
	
	@Override
	public void powerOn() {
		this.active = true;
	}

	@Override
	public void powerOff() {
		this.active = false;
	}

	@Override
	public void increaseVolume() {
		this.volume +=1;
	}

	@Override
	public void decreaseVolume() {
		this.volume -=1;
	}

	@Override
	public void showStatus() {
        System.out.println("------------- RADIO -----------------");
        System.out.println("Currently " + (active ? "ON" : "OFF"));
        System.out.println("Current volume is " + volume + "%");
        System.out.println("------------------------------------\n");
	}
}
