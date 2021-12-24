package com.hr.handlers;

public abstract class CurrencyDispenser {

	private CurrencyDispenser nextDispenser;
	
	public CurrencyDispenser setNext(final CurrencyDispenser dispenser)
	{
		this.nextDispenser = dispenser;
		return nextDispenser;
	}
	
	public CurrencyDispenser getNextDispenser()
	{
		return this.nextDispenser;
	}
	
	protected void delegateToNextDispenser(int amount) {
		if(amount == 0)
		{
			System.out.println("Further dispensing not required");
			return;
		}
		
		if(null!=this.nextDispenser)
		{
			this.nextDispenser.dispenseCurrency(amount);
		}
	}
	
	abstract void dispenseCurrency(final int amount);
}
