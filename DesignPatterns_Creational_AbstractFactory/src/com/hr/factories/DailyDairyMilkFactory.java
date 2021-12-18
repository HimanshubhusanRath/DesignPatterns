package com.hr.factories;

import com.hr.products.DailyDairyMilk;
import com.hr.products.Milk;

public class DailyDairyMilkFactory implements MilkFactory{

	public Milk produceMilk() {
		return new DailyDairyMilk();
	}
}
