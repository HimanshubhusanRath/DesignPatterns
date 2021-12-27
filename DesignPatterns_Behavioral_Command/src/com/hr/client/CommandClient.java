package com.hr.client;

import com.hr.commands.BuyOrder;
import com.hr.commands.SaleOrder;
import com.hr.domain.Broker;
import com.hr.domain.Stock;

public class CommandClient {

	public static void main(String[] args) {
		Broker broker = new Broker();
		final Stock sbiStock = new Stock();
		broker.addOrder(new BuyOrder(sbiStock));
		broker.addOrder(new SaleOrder(sbiStock));
		
		broker.executeOrders();
	}
}
