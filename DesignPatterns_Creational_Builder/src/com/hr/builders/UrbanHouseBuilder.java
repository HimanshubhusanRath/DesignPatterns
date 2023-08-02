package com.hr.builders;

import com.hr.product.House;

public class UrbanHouseBuilder implements Builder{

	private String location;
	private String type;
	private String wallType;
	private String roofType;
	private int bedroomCount;
	private String hallType;
	private String kitchenType;
	private int balconyCount;
	
	public void createWalls() {
		System.out.println("Created : concrete walls");
		wallType = "CONCRETE-WALL";
	}

	public void createRoof() {
		System.out.println("Created : concrete roof");
		roofType = "CONCRETE-ROOF";
	}

	public void create1Bedroom() {
		System.out.println("Created : one medium bedroom");
		bedroomCount = 1;
	}

	public void create2Bedrooms() {
		System.out.println("Created : two small bedrooms");
		bedroomCount = 2;
	}
	
	public void createHall() {
		System.out.println("Created : medium hall");
		hallType = "MEDIUM-HALL";
	}
	
	public void createKitchen() {
		System.out.println("Created : small kitchen");
		kitchenType = "SMALL-KITCHEN";
	}
	
	public void create1balcony() {
		System.out.println("Created : medium balcony");
		balconyCount = 1;
	}
	
	public void create2balconies() {
		System.out.println("Created : two small balconies");
		balconyCount = 2;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void markLocation() {
		this.location = "URBAN";
	}

	@Override
	public House build() {
		return new House(location, type, wallType, roofType, bedroomCount, hallType, kitchenType, balconyCount);
	}
}
