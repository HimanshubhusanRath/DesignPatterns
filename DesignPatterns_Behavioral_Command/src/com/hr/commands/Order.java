package com.hr.commands;

import com.hr.domain.Stock;

public abstract class Order {

	protected Stock stock;
	
	public Order(final Stock stock) {
		this.stock = stock;
	}
	
	public abstract void execute();
}
