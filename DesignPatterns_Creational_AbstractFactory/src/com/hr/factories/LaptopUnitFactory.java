package com.hr.factories;

import com.hr.products.Charger;
import com.hr.products.Earphone;
import com.hr.products.Laptop;

public interface LaptopUnitFactory {

	Laptop createLaptop();
	Charger createCharger();
	Earphone createEarphone();
}
