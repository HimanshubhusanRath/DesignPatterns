package com.hr.decorators;

import com.hr.components.DataSource;

/**
 * Abstract decorator class. Extra logic will be implemented in the sub classes.
 * 
 * @author himanshubhusan.rath
 *
 */
public class DataSourceDecorator implements DataSource{

	private DataSource dataSource;
	
	public DataSourceDecorator(final DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public void writeData(String data) {
		dataSource.writeData(data);
	}

	@Override
	public String readData() {
		return dataSource.readData();
	}
	
}
