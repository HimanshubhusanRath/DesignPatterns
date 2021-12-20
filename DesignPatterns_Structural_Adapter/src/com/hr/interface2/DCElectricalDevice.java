package com.hr.interface2;

public class DCElectricalDevice {
	
	public void charge(final DCPowerSource powerSource)
	{
		if(powerSource.getVolts()<=12)
		{
			System.out.println("Hurray ! Compatible DC power supply");
		}
		else
		{
			System.out.println("oops ! Incompatible power supply");
		}
	}
	
}
