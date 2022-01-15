package com.hr.elements;

import com.hr.visitor.InsuranceVisitor;

public class Bank implements Entity{

	@Override
	public void accept(InsuranceVisitor visitor) {
		visitor.visit(this);
	}
}
