package com.hr.prototype;

public class Bus implements Cloneable{

	private String name;
	private int registrationNumber;
	
	public Bus()
	{
	}
	
	public Bus(final Bus bus) {
		this.name = bus.getName();
		this.registrationNumber = bus.getRegistrationNumber();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	@Override
	public Bus cloneIt() {
		return new Bus(this);
	}
	
	@Override
	public String toString() {
		return "Bus [name=" + name + ", registrationNumber=" + registrationNumber + "]";
	}

	
}
