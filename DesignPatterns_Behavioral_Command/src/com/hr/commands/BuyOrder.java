package com.hr.commands;

import com.hr.domain.Stock;

public class BuyOrder extends Order{

	public BuyOrder(Stock stock) {
		super(stock);
	}

	@Override
	public void execute() {
		stock.buy();
	}
}
