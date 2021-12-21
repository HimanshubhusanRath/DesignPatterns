package com.hr.components;

public interface DataSource {

	void writeData(final String data);
	
	String readData();
}
