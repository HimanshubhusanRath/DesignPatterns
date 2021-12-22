package com.hr.services;

import java.util.HashMap;
import java.util.Map;

import com.hr.models.Product;

public class ProductService {

	final static Map<String,Product> products = new HashMap<String,Product>();
	
	static
	{
		products.put("P1", new Product("P1", 100.00));
		products.put("P2", new Product("P2", 200.00));
		products.put("P3", new Product("P3", 300.00));
	}
	
	public Product getProductByCode(final String productCode)
	{
		return products.get(productCode);
	}
}
