package com.hr.client;


import com.hr.components.BasicFileDataSource;
import com.hr.components.DataSource;
import com.hr.decorators.DataSourceCompressionDecorator;
import com.hr.decorators.DataSourceEncryptionDecorator;

public class DecoratorClient {

	public static void main(String[] args) {
		final String data = "My name is Himanshu \n I am from India";
		final String file = "/Users/himanshubhusan.rath/Documents/work/Workspace/Learning/architect/DesignPatterns_Structural_Decorator/output.txt";
		
		DataSource compressedDataSource = new DataSourceCompressionDecorator(
												new DataSourceEncryptionDecorator(
														new BasicFileDataSource(file)));
		
		DataSource fileDataSource = new BasicFileDataSource(file);
		
		// Write data
		compressedDataSource.writeData(data);
		System.out.println("---------- Original Data -------------");
		System.out.println(data);
		System.out.println("\n---------- Encoded Data ----------");
		System.out.println(fileDataSource.readData());
		System.out.println("\n---------- Decoded Data -----------");
		System.out.println(compressedDataSource.readData());
				
				
	}
}
