package com.hr.elements;

import com.hr.visitor.InsuranceVisitor;

public class Mall implements Entity{

	@Override
	public void accept(InsuranceVisitor visitor) {
		visitor.visit(this);
	}
}
