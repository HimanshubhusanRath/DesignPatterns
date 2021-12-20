package com.hr.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hr.componentinterface.FoodComponent;

public class FoodBox implements FoodComponent{

	private List<FoodComponent> components = new ArrayList<>();
	
	public FoodBox()
	{
	}
	
	public FoodBox(final FoodComponent...components)
	{
		this.components = Arrays.asList(components);
	}
	
	@Override
	public double calculateTotalPrice() {
		
		double totalPrice = 0.00;
		
		for(FoodComponent comp : this.components)
		{
			totalPrice+= comp.calculateTotalPrice();
		}
		
		// 5.00 is the packing charge
		return totalPrice + 5.00;
	}

}
