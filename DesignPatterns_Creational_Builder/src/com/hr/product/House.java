package com.hr.product;

public class House {

	private String location;
	private String type;
	private String wallType;
	private String roofType;
	private int bedroomCount;
	private String hallType;
	private String kitchenType;
	private int balconyCount;
	
	public House(String location, String type, String wallType, String roofType, int bedroomCount, String hallType,
			String kitchenType, int balconyCount) {
		super();
		this.location = location;
		this.type = type;
		this.wallType = wallType;
		this.roofType = roofType;
		this.bedroomCount = bedroomCount;
		this.hallType = hallType;
		this.kitchenType = kitchenType;
		this.balconyCount = balconyCount;
	}

	@Override
	public String toString() {
		return "House [location=" + location + ", type=" + type + ", wallType=" + wallType + ", roofType=" + roofType
				+ ", bedroomCount=" + bedroomCount + ", hallType=" + hallType + ", kitchenType=" + kitchenType
				+ ", balconyCount=" + balconyCount + "]";
	}
	
	
	
	
	
}
