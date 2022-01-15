package com.hr.visitor;

import com.hr.elements.Bank;
import com.hr.elements.Mall;
import com.hr.elements.Person;

public class ConcreteInsuranceVisitor implements InsuranceVisitor{

	@Override
	public void visit(Bank b) {
		System.out.println("Showing the THEFT insurance to the bank");
	}
	
	@Override
	public void visit(Mall m) {
		System.out.println("Showing FLOOD insurance to the mall");
	}
	
	@Override
	public void visit(Person p) {
		System.out.println("Showing HEALTH insurance to the person");
	}
}
