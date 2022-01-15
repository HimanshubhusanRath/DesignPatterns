package com.hr.client;

import java.util.Arrays;
import java.util.List;

import com.hr.elements.Bank;
import com.hr.elements.Entity;
import com.hr.elements.Mall;
import com.hr.elements.Person;
import com.hr.visitor.ConcreteInsuranceVisitor;
import com.hr.visitor.InsuranceVisitor;

public class VisitorClient {

	public static void main(String[] args) {
		List<Entity> entities = Arrays.asList(new Bank(), new Mall(), new Person());

		InsuranceVisitor visitor = new ConcreteInsuranceVisitor();
		
		for(Entity e : entities)
		{
			e.accept(visitor);
		}
	}

}
