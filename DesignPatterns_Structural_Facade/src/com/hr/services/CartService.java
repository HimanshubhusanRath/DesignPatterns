package com.hr.services;

import java.util.Calendar;

import com.hr.models.Cart;
import com.hr.models.Product;

public class CartService {

	public Cart createCart()
	{
		final String cartId = "Cart-"+Calendar.getInstance().getTimeInMillis(); 
		return new Cart(cartId);
	}
	
	public boolean addToCart(final Cart cart, final Product product)
	{
		if(product.getPrice() > 0.0)
		{
			cart.addProduct(product);
			return true;
		}
		else{
			return false;
		}
	}
	
}
