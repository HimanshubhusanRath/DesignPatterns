package com.hr.visitor;

import com.hr.elements.Bank;
import com.hr.elements.Mall;
import com.hr.elements.Person;

public interface InsuranceVisitor {

	void visit(final Person p);
	void visit(final Mall m);
	void visit(final Bank b);
}
