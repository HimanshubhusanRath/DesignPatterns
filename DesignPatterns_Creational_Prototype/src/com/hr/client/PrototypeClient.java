package com.hr.client;

import com.hr.prototype.Bus;

public class PrototypeClient {

	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.setName("Mo-Bus");
		bus1.setRegistrationNumber(12121);
		System.out.println("Bus1's hashcode : "+bus1.hashCode());
		System.out.println(bus1);
		
		// clone the bus object
		Bus bus2 = bus1.cloneIt();
		System.out.println(bus2);
		System.out.println("Bus2's hashcode : "+bus2.hashCode());
		System.out.println(bus2);
	}
}
