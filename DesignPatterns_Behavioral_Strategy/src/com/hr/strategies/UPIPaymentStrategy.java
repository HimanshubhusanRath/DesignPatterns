package com.hr.strategies;

import java.util.Scanner;

public class UPIPaymentStrategy implements PaymentStrategy{

	@Override
	public void pay() {
		System.out.println("=== UPI PAYMENT ===");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter upi ID");
		String upiId = sc.nextLine();
		System.out.println("UPI payment initiated");
			
	}
}
