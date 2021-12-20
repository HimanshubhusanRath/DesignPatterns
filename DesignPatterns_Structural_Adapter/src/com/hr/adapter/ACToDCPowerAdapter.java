package com.hr.adapter;

import com.hr.interface1.ACPowerSource;
import com.hr.interface2.DCPowerSource;

public class ACToDCPowerAdapter extends DCPowerSource{

	private ACPowerSource acPowerSource;
	
	public ACToDCPowerAdapter(ACPowerSource acPowerSource) {
		this.acPowerSource = acPowerSource;
	}

	@Override
	public int getVolts() {
		final int acVoltsAfterReduction = acPowerSource.getVolts() / 20;
		// Returns the minimum between DC default voltage and AC voltage after reduction 
		if(acVoltsAfterReduction > super.getVolts())
		{
			return super.getVolts();
		}
		else
		{
			return acVoltsAfterReduction;
		}
	}
	
}
