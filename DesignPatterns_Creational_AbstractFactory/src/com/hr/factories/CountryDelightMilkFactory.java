package com.hr.factories;

import com.hr.products.CountryDelightMilk;
import com.hr.products.Milk;

public class CountryDelightMilkFactory implements MilkFactory{

	public Milk produceMilk() {
		return new CountryDelightMilk();
	}
}
