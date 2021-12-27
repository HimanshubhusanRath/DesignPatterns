package com.hr.iterator;

import java.util.List;

import com.hr.collection.Student;

public class StackIterator implements IIterator{

	private List<Student> collection;
	private int currIndex=0;
	
	public StackIterator(final List<Student> collection)
	{
		this.collection = collection;
		this.currIndex = collection.size();
	}

	@Override
	public boolean hasNext() {
		if(this.currIndex-1>=0)
		{
			return true;
		}
		return false;
	}

	@Override
	public Student next() {
		if(hasNext())
		{
			this.currIndex-=1;
			return collection.get(currIndex);
		}
		else
		{
			System.out.println("No more elements in the collection");
		}
		return null;
	}
	
}
