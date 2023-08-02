package com.hr.builders;

import com.hr.product.House;

public interface Builder {

	void createWalls();
	void createRoof();
	void create1Bedroom();
	void create2Bedrooms();
	void createHall();
	void createKitchen();
	void create1balcony();
	void create2balconies();
	
	void setType(final String type);
	void markLocation();
	House build();
}
