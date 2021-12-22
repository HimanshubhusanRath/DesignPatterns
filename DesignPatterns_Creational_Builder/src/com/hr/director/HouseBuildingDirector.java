package com.hr.director;

import com.hr.builders.Builder;

public class HouseBuildingDirector {

	private Builder builder;

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	/**
	 * Create 1 BHK house
	 * 
	 * @param builder
	 */
	public void build1bhk(final Builder builder) {
		this.builder = builder;
		System.out.println("===== Building 1 BHK =======");
		builder.createWalls();
		builder.createRoof();
		builder.create1Bedroom();
		builder.createHall();
		builder.createKitchen();
		builder.create1balcony();
		
		builder.setType("1BHK");
		builder.markLocation();
	}
	
	/**
	 * Create 2 BHK house
	 * 
	 * @param builder
	 */
	public void build2bhk(final Builder builder) {
		this.builder = builder;
		System.out.println("===== Building 2 BHK =======");
		builder.createWalls();
		builder.createRoof();
		builder.create2Bedrooms();
		builder.createHall();
		builder.createKitchen();
		builder.create2balconies();
		
		builder.setType("2BHK");
		builder.markLocation();
	}
	
}
