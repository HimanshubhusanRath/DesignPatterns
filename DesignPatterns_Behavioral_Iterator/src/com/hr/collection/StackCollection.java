package com.hr.collection;

import java.util.List;

import com.hr.iterator.IIterator;
import com.hr.iterator.StackIterator;

public class StackCollection implements ICollection{

	private List<Student> collection;
	
	public StackCollection(final List<Student> collection) {
		this.collection = collection;
	}
	
	@Override
	public IIterator createIterator() {
		return new StackIterator(this.collection);
	}

	
}
