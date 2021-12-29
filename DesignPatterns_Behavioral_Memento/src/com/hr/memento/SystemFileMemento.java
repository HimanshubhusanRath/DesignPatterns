package com.hr.memento;

public class SystemFileMemento {

	private String fileContent;
	
	public SystemFileMemento(String fileContent) {
		this.fileContent = fileContent;
	}
	public String getFileContent() {
		return fileContent;
	}
}
