package com.hr.elements;

import com.hr.visitor.InsuranceVisitor;

public interface Entity {

	void accept(InsuranceVisitor visitor);
}
