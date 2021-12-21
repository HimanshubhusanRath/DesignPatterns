package com.hr.decorators;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

import com.hr.components.DataSource;

/**
 * Decorator class providing the compression and decompression functionalities 
 * 
 * @author himanshubhusan.rath
 *
 */
public class DataSourceCompressionDecorator extends DataSourceDecorator{

	public DataSourceCompressionDecorator(final DataSource dataSource) {
		super(dataSource);
	}
	
	@Override
	public void writeData(String data) {
		// Performs compression the data before passing it to the other data source
		super.writeData(compress(data));
	}

	@Override
	public String readData() {
		// Performs decompression after getting the data from the other data source
		return decompress(super.readData());
	}
	
	private String compress(final String data)
	{
		byte[] bytes = data.getBytes();
		try
		{
			ByteArrayOutputStream bos = new ByteArrayOutputStream(512);
			DeflaterOutputStream dos = new DeflaterOutputStream(bos,new Deflater(6));
			dos.write(bytes);
			dos.close();
			bos.close();
			
			return Base64.getEncoder().encodeToString(bos.toByteArray());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}
	
	private String decompress(final String data)
	{
		byte[] bytes = Base64.getDecoder().decode(data.getBytes());
		
		try
		{
			ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
			InflaterInputStream infs = new InflaterInputStream(bis);
			ByteArrayOutputStream bos = new ByteArrayOutputStream(512);
			
			int b;
			// Read from inflater stream and write to byte array output stream
			while((b=infs.read())!= -1)
			{
				bos.write(b);
			}
			infs.close();
			bis.close();
			bos.close();			
			
			return new String(bos.toByteArray());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
}
