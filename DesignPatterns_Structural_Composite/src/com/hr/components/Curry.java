package com.hr.components;

import com.hr.componentinterface.FoodComponent;

public class Curry implements FoodComponent{

	@Override
	public double calculateTotalPrice() {
		return 40.00;
	}

}
