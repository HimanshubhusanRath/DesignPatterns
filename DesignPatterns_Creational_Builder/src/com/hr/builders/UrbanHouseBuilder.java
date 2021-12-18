package com.hr.builders;

import com.hr.product.House;

public class UrbanHouseBuilder implements Builder{

	private String type;
	private String location;
	
	public void createWalls() {
		System.out.println("Created : concrete walls");
	}

	public void createRoof() {
		System.out.println("Created : concrete roof");
	}

	public void create1Bedroom() {
		System.out.println("Created : one medium bedroom");
	}

	public void create2Bedrooms() {
		System.out.println("Created : two small bedrooms");
	}
	
	public void createHall() {
		System.out.println("Created : medium hall");
	}
	
	public void createKitchen() {
		System.out.println("Created : small kitchen");
	}
	
	public void create1balcony() {
		System.out.println("Created : medium balcony");
	}
	
	public void create2balconies() {
		System.out.println("Created : two small balconies");
	}

	public void setType(String type) {
		this.type = type;
	}

	public void markLocation() {
		this.location = "URBAN";			
	}

	public House getTheHouse() {
		return new House(location, type);
	}
}
