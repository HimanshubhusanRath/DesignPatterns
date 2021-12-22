package com.hr.hierarchy2.implementation;

public class TV implements Device{

	private int volume = 5;
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
        System.out.println("------------- TV -----------------");
        System.out.println("Currently " + (active ? "ON" : "OFF"));
        System.out.println("Current volume is " + volume + "%");
        System.out.println("------------------------------------\n");
	}

	@Override
	public void setVolume(int vol) {
		this.volume = vol;
	}

}
