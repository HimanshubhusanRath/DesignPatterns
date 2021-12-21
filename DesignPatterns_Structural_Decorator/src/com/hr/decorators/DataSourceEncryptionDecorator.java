package com.hr.decorators;

import com.hr.components.DataSource;

/**
 * Decorator class providing the encryption and decryption functionalities 
 * 
 * @author himanshubhusan.rath
 *
 */
public class DataSourceEncryptionDecorator extends DataSourceDecorator{

	public DataSourceEncryptionDecorator(final DataSource dataSource) {
		super(dataSource);
	}
	
	@Override
	public void writeData(String data) {
		// Performs encryption before passing it to the other data source 
		super.writeData(encrypt(data));
	}

	@Override
	public String readData() {
		// Performs decryption after getting the data from other data source
		return decrypt(super.readData());
	}
	
	private String encrypt(final String data)
	{
		byte[] bytes = data.getBytes();
		for(int i=0; i<bytes.length;i++)
		{
			bytes[i] += 1;
		}
		
		return new String(bytes);
	}
	
	private String decrypt(final String data)
	{
		byte[] bytes = data.getBytes();
		for(int i=0; i<bytes.length;i++)
		{
			bytes[i] -= 1;
		}
		
		return new String(bytes);
	}
	
	
	
	
}
