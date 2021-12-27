package com.hr.iterator;

import com.hr.collection.Student;

public interface IIterator {

	boolean hasNext();
	
	Student next();
}
