package com.hr.caretaker;

import java.util.HashMap;
import java.util.Map;

import com.hr.memento.SystemFileMemento;
import com.hr.originator.SystemFile;

public class SystemFileManager {

	private SystemFile systemFile;
	private static Map<String,SystemFileMemento> snapShots = new HashMap<>();
	
	public SystemFileManager(final SystemFile sysFile)
	{
		this.systemFile = sysFile;
	}
	
	public void updateContent(final String date, final String content)
	{
		// Take a backup of the file
		snapShots.put(date,systemFile.save());
		
		// Update the content
		systemFile.updateFileContent(content);
	}

	public void restoreToDate(final String date)
	{
		final SystemFileMemento snapShot = snapShots.get(date); 
		systemFile.restore(snapShot);
	}
	
}
