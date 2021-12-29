package com.hr.client;

import com.hr.caretaker.SystemFileManager;
import com.hr.originator.SystemFile;

public class MementoClient {
	
	public static void main(String[] args) {
		final SystemFile systemFile = new SystemFile("abc.txt", "Initial File");
		final SystemFileManager sysFileManager = new SystemFileManager(systemFile);
		
		sysFileManager.updateContent("Jan-22", "Content on 5th January,2021");
		System.out.println(systemFile);
		sysFileManager.updateContent("Feb-22", "Content on 12th February,2021");
		System.out.println(systemFile);
		sysFileManager.updateContent("Mar-22", "Content on 8th March,2021");
		System.out.println(systemFile);
		sysFileManager.updateContent("Apr-22", "Content on 25th April,2021");
		System.out.println(systemFile);

		System.out.println("\n--------------- Latest State ------------\n");
		System.out.println(systemFile);
		
		System.out.println("\n--------------- Restoring to an earlier state------------\n");
		sysFileManager.restoreToDate("Mar-22");
		System.out.println(systemFile);
		
	}

}
