package com.hr.misc.objectsizecheck;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Professor {
	private List<Course> courses = new ArrayList<>();
    private String name;
    private boolean tenured;
    private int level;
    private LocalDate birthDay;
    private double lastEvaluation;
    
	public Professor(Course course, String name, boolean tenured, int level, LocalDate birthDay,
			double lastEvaluation) {
		super();
		this.courses.add(course);
		this.courses.add(course);
		this.courses.add(course);
		this.name = name;
		this.tenured = tenured;
		this.level = level;
		this.birthDay = birthDay;
		this.lastEvaluation = lastEvaluation;
	}
}