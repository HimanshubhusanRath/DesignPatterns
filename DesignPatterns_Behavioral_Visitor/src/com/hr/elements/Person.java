package com.hr.elements;

import com.hr.visitor.InsuranceVisitor;

public class Person implements Entity{

	@Override
	public void accept(InsuranceVisitor visitor) {
		visitor.visit(this);
	}
}
