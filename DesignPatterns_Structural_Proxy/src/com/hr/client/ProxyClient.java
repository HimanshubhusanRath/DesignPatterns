package com.hr.client;

import com.hr.proxy.InternetProxy;
import com.hr.service.Internet;

public class ProxyClient {

	public static void main(String[] args) throws Exception{
		final Internet internet = new InternetProxy();
		internet.connect("www.google.com");
		internet.connect("www.freegames.com");
	}
}
