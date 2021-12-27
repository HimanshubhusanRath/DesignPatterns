package com.hr.domain;

import java.util.ArrayList;
import java.util.List;

import com.hr.commands.Order;

public class Broker {

	private List<Order> orders = new ArrayList<>();
	
	public void addOrder(final Order order)
	{
		this.orders.add(order);
	}
	
	public void executeOrders()
	{
		for(Order o : orders)
		{
			o.execute();
		}
	}
	
}
