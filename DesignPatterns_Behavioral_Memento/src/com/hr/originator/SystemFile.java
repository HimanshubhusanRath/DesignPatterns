package com.hr.originator;

import com.hr.memento.SystemFileMemento;

public class SystemFile {

	private String fileName;
	private String fileContent;
	
	public SystemFile(String fileName, String fileContent) {
		this.fileName = fileName;
		this.fileContent = fileContent;
	}
	
	public SystemFileMemento save()
	{
		return new SystemFileMemento(this.fileContent);
	}
	
	public void restore(final SystemFileMemento snapShot)
	{
		this.fileContent = snapShot.getFileContent();
	}

	@Override
	public String toString() {
		return "SystemFile [fileName=" + fileName + ", fileContent=" + fileContent + "]";
	}

	public void updateFileContent(String content) {
		System.out.println("Updating the file content");
		this.fileContent = content;
	}
	
}
