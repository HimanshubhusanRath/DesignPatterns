package com.hr.client;

import com.hr.factories.DailyDairyMilkFactory;
import com.hr.factories.MilkFactory;
import com.hr.products.Milk;

public class FactoryMethodClient {

	public static void main(String[] args) {
		MilkFactory milkFactory = new DailyDairyMilkFactory();
		Milk milk = milkFactory.produceMilk();
		milk.displayBrand();
	}
}
