package com.hr.components;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Performs basic file reading and writing activities.
 * 
 * @author himanshubhusan.rath
 *
 */
public class BasicFileDataSource implements DataSource{

	private String filePath;
	
	public BasicFileDataSource(final String filePath) {
		this.filePath = filePath;
	}
	
	@Override
	public void writeData(String data) {
		File file = new File(filePath);
		try(OutputStream os = new FileOutputStream(file))
		{
			os.write(data.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String readData() {
		byte[] result = null;
		File file = new File(filePath);
		try(InputStream is = new FileInputStream(file))
		{
			result = new byte[(int)file.length()];
			is.read(result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new String(result);
	}

}
