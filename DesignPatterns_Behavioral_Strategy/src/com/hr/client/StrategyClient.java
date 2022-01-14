package com.hr.client;

import java.util.Scanner;

import com.hr.context.OrderManager;
import com.hr.strategies.CardPaymentStrategy;
import com.hr.strategies.PaymentStrategy;
import com.hr.strategies.UPIPaymentStrategy;

public class StrategyClient {

	public static void main(String[] args) {
		OrderManager orderManager = new OrderManager();
		orderManager.createCart();
		orderManager.addItemsToCart();
		
		System.out.println("Select payment mode \n\n 1. Card Payment \n 2. UPI Payment");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		// Define the payment strategy
		PaymentStrategy paymentStrategy = null;
		
		if(choice==1)
		{
			paymentStrategy = new CardPaymentStrategy();
		}
		else
		{
			paymentStrategy = new UPIPaymentStrategy();
		}
		
		orderManager.processPayment(paymentStrategy);
		
	}

}
