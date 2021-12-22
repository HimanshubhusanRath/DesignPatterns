package com.hr.models;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Product> items = new ArrayList<Product>();
	private String cartId;

	public Cart(final String cartId)
	{
		this.cartId = cartId;
	}

	public void addProduct(final Product product)
	{
		this.items.add(product);
	}

}
