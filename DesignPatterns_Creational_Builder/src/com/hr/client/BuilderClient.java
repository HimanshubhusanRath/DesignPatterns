package com.hr.client;

import com.hr.builders.RuralHouseBuilder;
import com.hr.builders.UrbanHouseBuilder;
import com.hr.director.HouseBuildingDirector;

public class BuilderClient {

	public static void main(String[] args) {
		HouseBuildingDirector director = new HouseBuildingDirector();
		/*
		 * Build 1 bhk using different builders
		 */
		// Create a 1BHK at village (rural area)
		RuralHouseBuilder ruralBuilder = new RuralHouseBuilder();
		director.build1bhk(ruralBuilder);
		System.out.println(ruralBuilder.getTheHouse());
		// Create a 1BHK at city (urban area)
		UrbanHouseBuilder urbanBuilder = new UrbanHouseBuilder();
		director.build1bhk(urbanBuilder);
		System.out.println(urbanBuilder.getTheHouse());
		
		/*
		 * Build 2 bhk using different builders
		 */
		// Create a 2BHK at village (rural area)
		director.build2bhk(ruralBuilder);
		System.out.println(ruralBuilder.getTheHouse());
		// Create a 2BHK at city (urban area)
		director.build2bhk(urbanBuilder);
		System.out.println(urbanBuilder.getTheHouse());
		
	}
}
