package com.hr.context;

import com.hr.strategies.PaymentStrategy;

public class OrderManager {

	public void createCart()
	{
		System.out.println("Cart is created");
	}
	
	public void addItemsToCart()
	{
		System.out.println("Items are added to cart");
	}
	
	public void processPayment(final PaymentStrategy paymentStrategy)
	{
		paymentStrategy.pay();
	}
}
