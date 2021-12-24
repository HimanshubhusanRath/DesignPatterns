package com.hr.handlers;

public class Rs2000Dispenser extends CurrencyDispenser{

	public void dispenseCurrency(final int amount)
	{
		final int currency = 2000;
		final int dispensedQuantity = (int) Math.floor(amount/currency);
		System.out.println(currency+" rupess count : "+dispensedQuantity);
		
		// Delegate the work to next dispenser
		delegateToNextDispenser(amount%currency);
	}

}
