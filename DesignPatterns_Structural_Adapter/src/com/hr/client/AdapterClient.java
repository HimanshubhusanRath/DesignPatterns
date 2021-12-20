package com.hr.client;

import com.hr.adapter.ACToDCPowerAdapter;
import com.hr.interface1.ACPowerSource;
import com.hr.interface2.DCElectricalDevice;
import com.hr.interface2.DCPowerSource;

public class AdapterClient {

	public static void main(String[] args) {
		DCPowerSource dcPower = new DCPowerSource();
		DCElectricalDevice dcElectricalDevice = new DCElectricalDevice();
		// Try to charge the DC electrical device with DC power 
		dcElectricalDevice.charge(dcPower);
		
		// Try to charge the DC electrical device with the AC power with 240 volts
		ACPowerSource acPower = new ACPowerSource(240);
		// dcElectricalDevice.charge(acPower); // Compile time exception as the contracts do not match
		
		// Use adapter to solve this issue
		ACToDCPowerAdapter adapter = new ACToDCPowerAdapter(acPower);
		dcElectricalDevice.charge(adapter);
	}
}
