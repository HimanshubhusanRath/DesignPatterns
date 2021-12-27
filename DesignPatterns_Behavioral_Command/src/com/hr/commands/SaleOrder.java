package com.hr.commands;

import com.hr.domain.Stock;

public class SaleOrder extends Order{

	public SaleOrder(Stock stock) {
		super(stock);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		stock.sale();
	}
}
