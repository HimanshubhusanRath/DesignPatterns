package com.hr.collection;

import java.util.List;

import com.hr.iterator.IIterator;
import com.hr.iterator.QueueIterator;

public class QueueCollection implements ICollection{

	private List<Student> collection;
	
	public QueueCollection(final List<Student> collection) {
		this.collection = collection;
	}
	
	@Override
	public IIterator createIterator() {
		return new QueueIterator(this.collection);
	}

	
}
