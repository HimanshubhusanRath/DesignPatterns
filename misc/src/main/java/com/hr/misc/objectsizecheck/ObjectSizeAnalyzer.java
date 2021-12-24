package com.hr.misc.objectsizecheck;

import java.time.LocalDate;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

public class ObjectSizeAnalyzer 
{
	
	
    public static void main( String[] args )
    {
    	//System.out.println(VM.current().details());
    	String name = "Computer Science and Engineering";
    	Course course = new Course(name);
    	Professor professor = new Professor(course, "John", true, 1, LocalDate.now(), 100.00);
    	
    	
    	System.out.println("=============== Shallow Size of Class=================\n");
    	System.out.println(ClassLayout.parseClass(Course.class).toPrintable());
    	System.out.println(ClassLayout.parseClass(Professor.class).toPrintable());
    	System.out.println("=============== Shallow Size of Instance=================\n");
    	System.out.println("Shallow size of COURSE instance : "+VM.current().sizeOf(course)+ " bytes");
    	System.out.println("Shallow size of PREOFESSOR instance : "+VM.current().sizeOf(professor)+ " bytes");
    	
    	System.out.println("\n\n=============== Deep Size of the string lateral =================\n");
    	System.out.println(ClassLayout.parseInstance(name.toCharArray()).toPrintable());   
    	System.out.println("\n\nNOTE: Deep size of the instance = Shallow size of the instance + deep size of the individual values");
    	
    }
}
