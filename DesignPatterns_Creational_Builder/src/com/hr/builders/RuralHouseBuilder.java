package com.hr.builders;

import com.hr.product.House;

public class RuralHouseBuilder implements Builder{

	private String type;
	private String location;
	
	public void createWalls() {
		System.out.println("Created : muddy walls");
	}

	public void createRoof() {
		System.out.println("Created : wooden roof");
	}

	public void create1Bedroom() {
		System.out.println("Created : one big bedroom");
	}

	public void create2Bedrooms() {
		System.out.println("Created : two medium bedrooms");
	}
	
	public void createHall() {
		System.out.println("Created : big hall");
	}
	
	public void createKitchen() {
		System.out.println("Created : medium kitchen");
	}
	
	public void create1balcony() {
		System.out.println("Created : - no balcony -");
	}
	
	public void create2balconies() {
		System.out.println("Created : - no balcony -");
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public void markLocation() {
		this.location = "RURAL";		
	}

	public House getTheHouse() {
		return new House(location, type);
	}
}
