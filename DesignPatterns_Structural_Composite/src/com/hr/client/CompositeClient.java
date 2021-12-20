package com.hr.client;

import com.hr.components.Curry;
import com.hr.components.FoodBox;
import com.hr.components.Rice;

public class CompositeClient {

	public static void main(String[] args) {
		Rice rice = new Rice();
		Curry curry = new Curry();
		
		FoodBox finalBox = new FoodBox(
					rice, 
					curry,
					new FoodBox(rice, 
							new FoodBox(curry))
				);
		
		System.out.println("Total price of the lunch box = "+finalBox.calculateTotalPrice());
	}
}
