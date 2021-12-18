package com.hr.factories;

import com.hr.products.Charger;
import com.hr.products.Earphone;
import com.hr.products.Laptop;
import com.hr.products.dell.DellCharger;
import com.hr.products.dell.DellEarphone;
import com.hr.products.dell.DellLaptop;

public class DellLaptopUnitFactory implements LaptopUnitFactory{

	public Laptop createLaptop() {
		return new DellLaptop();
	}
	
	public Charger createCharger() {
		return new DellCharger();
	}
	
	public Earphone createEarphone() {
		return new DellEarphone();
	}
	
}
