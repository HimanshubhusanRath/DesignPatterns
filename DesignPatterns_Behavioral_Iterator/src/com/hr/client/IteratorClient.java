package com.hr.client;

import java.util.ArrayList;
import java.util.List;

import com.hr.collection.QueueCollection;
import com.hr.collection.StackCollection;
import com.hr.collection.Student;
import com.hr.iterator.IIterator;

public class IteratorClient {

	public static void main(String[] args) {
		final List<Student> students = createStudents();
		
		// Define the collections
		final StackCollection stack =  new StackCollection(students);
		final QueueCollection queue =  new QueueCollection(students);
		
		System.out.println("---------- Iterating the stack collection ---------");
		final IIterator stackIterator = stack.createIterator();
		while(stackIterator.hasNext())
		{
			System.out.println(stackIterator.next().getName());
		}
		
		System.out.println("\n\n---------- Iterating the queue collection ---------");
		final IIterator queueIterator = queue.createIterator();
		while(queueIterator.hasNext())
		{
			System.out.println(queueIterator.next().getName());
		}
	}

	private static List<Student> createStudents() {
		final List<Student> students = new ArrayList<Student>();
		students.add(new Student("A"));
		students.add(new Student("B"));
		students.add(new Student("C"));
		students.add(new Student("D"));
		return students;
	}
}
