package com.hr.builders;

import com.hr.product.House;

public class RuralHouseBuilder implements Builder{

	private String location;
	private String type;
	private String wallType;
	private String roofType;
	private int bedroomCount;
	private String hallType;
	private String kitchenType;
	private int balconyCount;
	
	
	public void createWalls() {
		System.out.println("Created : muddy walls");
		wallType = "MUDDY-WALL";
	}

	public void createRoof() {
		System.out.println("Created : wooden roof");
		roofType = "WOODEN-ROOF";
	}

	public void create1Bedroom() {
		System.out.println("Created : one big bedroom");
		bedroomCount = 1;
	}

	public void create2Bedrooms() {
		System.out.println("Created : two medium bedrooms");
		bedroomCount = 2;
	}
	
	public void createHall() {
		System.out.println("Created : big hall");
		hallType = "BIG-HALL";
	}
	
	public void createKitchen() {
		System.out.println("Created : medium kitchen");
		kitchenType = "MEDIUM-KITCHEN";
	}
	
	public void create1balcony() {
		System.out.println("Created : - no balcony -");
		balconyCount = 1;
	}
	
	public void create2balconies() {
		System.out.println("Created : - no balcony -");
		balconyCount = 2;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public void markLocation() {
		this.location = "RURAL";		
	}

	@Override
	public House build() {
		return new House(location, type, wallType, roofType, bedroomCount, hallType, kitchenType, balconyCount);
	}
}
