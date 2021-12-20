package com.hr.factories;

import com.hr.products.Charger;
import com.hr.products.Earphone;
import com.hr.products.Laptop;
import com.hr.products.hp.HPCharger;
import com.hr.products.hp.HPEarphone;
import com.hr.products.hp.HPLaptop;

public class HPLaptopUnitFactory implements LaptopUnitFactory{

	public Laptop createLaptop() {
		return new HPLaptop();
	}
	
	public Charger createCharger() {
		return new HPCharger();
	}
	
	public Earphone createEarphone() {
		return new HPEarphone();
	}
	
}
