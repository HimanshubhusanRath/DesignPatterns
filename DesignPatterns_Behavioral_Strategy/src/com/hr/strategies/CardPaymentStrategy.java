package com.hr.strategies;

import java.util.Scanner;

public class CardPaymentStrategy implements PaymentStrategy{

	@Override
	public void pay() {
		System.out.println("=== CARD PAYMENT ===");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter card number");
		String cardNum = sc.nextLine();
		System.out.println("Enter expiry date in mm/yy format");
		String expDate = sc.nextLine();
		System.out.println("Enter CVV");
		int cvv = Integer.parseInt(sc.nextLine());
		System.out.println("Card payment initiated");
	}
}
