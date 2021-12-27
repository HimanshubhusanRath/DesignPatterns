package com.hr.client;

import com.hr.entities.Fan;
import com.hr.entities.Switch;
import com.hr.mediator.ElectricCircuitMediator;
import com.hr.mediator.Mediator;

public class MediatorClient {

	public static void main(String[] args) {
		// Define the entities
		final Fan fan =  new Fan();
		final Switch switchh = new Switch();
		
		// Define the mediator and add the entities to it.
		final Mediator mediator = new ElectricCircuitMediator();
		mediator.addSwitch(switchh);
		mediator.addFan(fan);
		
		// Now, operate on the entities
		switchh.press(); // This will start the fan
		switchh.press(); // This will stop the fan
	}

}
