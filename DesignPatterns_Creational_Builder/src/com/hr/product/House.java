package com.hr.product;

public class House {

	private String location;
	private String type;
	
	public House(String location, String type) {
		super();
		this.location = location;
		this.type = type;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "House [location=" + location + ", type=" + type + "]\n";
	}
	
}
