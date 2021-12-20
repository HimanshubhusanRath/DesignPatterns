package com.hr.client;

import com.hr.factories.DellLaptopUnitFactory;
import com.hr.factories.HPLaptopUnitFactory;
import com.hr.factories.LaptopUnitFactory;
import com.hr.products.Charger;
import com.hr.products.Earphone;
import com.hr.products.Laptop;

public class AbstractFactoryClient {

	public static void main(String[] args) {
		// Create Dell laptop unit
		LaptopUnitFactory dellFactory = new DellLaptopUnitFactory();
		Laptop dellLaptop = dellFactory.createLaptop();
		Charger dellCharger = dellFactory.createCharger();
		Earphone dellEarphone = dellFactory.createEarphone();
		System.out.println("---- DELL ----");
		dellLaptop.displaySize();
		dellCharger.displayPower();
		dellEarphone.displayNoiseLevel();
		
		// Create HP laptop unit
		LaptopUnitFactory HPFactory = new HPLaptopUnitFactory();
		Laptop hpLaptop = HPFactory.createLaptop();
		Charger hpCharger = HPFactory.createCharger();
		Earphone hpEarphone = HPFactory.createEarphone();
		System.out.println("---- HP ----");
		hpLaptop.displaySize();
		hpCharger.displayPower();
		hpEarphone.displayNoiseLevel();
		
	}
}
