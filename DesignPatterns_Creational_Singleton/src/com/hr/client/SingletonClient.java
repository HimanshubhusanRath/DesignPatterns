package com.hr.client;

import com.hr.singleton.GovernmentOfIndia;

public class SingletonClient {

	public static void main(String[] args) {
		GovernmentOfIndia instance1 = GovernmentOfIndia.getInstance();
		GovernmentOfIndia instance2 = GovernmentOfIndia.getInstance();
		System.out.println("Comparison of the hash codes of both instances : "+(instance1==instance2));
	}
}
