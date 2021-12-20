package com.hr.components;

import com.hr.componentinterface.FoodComponent;

public class Rice implements FoodComponent{

	@Override
	public double calculateTotalPrice() {
		return 20.0;
	}

}
