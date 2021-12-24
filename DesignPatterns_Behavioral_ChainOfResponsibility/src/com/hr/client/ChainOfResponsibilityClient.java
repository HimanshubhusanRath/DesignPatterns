package com.hr.client;

import com.hr.handlers.Rs100Dispenser;
import com.hr.handlers.Rs2000Dispenser;
import com.hr.handlers.Rs500Dispenser;

public class ChainOfResponsibilityClient {

	public static void main(String[] args) {
		Rs2000Dispenser rs2000Dispenser = new Rs2000Dispenser();
		Rs500Dispenser rs500Dispenser = new Rs500Dispenser();
		Rs100Dispenser rs100Dispenser = new Rs100Dispenser();
		
		// Stitch the dispensers together
		rs2000Dispenser.setNext(rs500Dispenser).setNext(rs100Dispenser);
		
		rs2000Dispenser.dispenseCurrency(5200);
		
	}
}
