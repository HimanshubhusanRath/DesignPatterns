package com.hr.facade;

import com.hr.models.Cart;
import com.hr.models.Product;
import com.hr.services.CartService;
import com.hr.services.ProductService;

public class CartFacade {

	private ProductService productService = new ProductService();
	private CartService cartService = new CartService();
	
	public boolean addProductToCart(final String productCode)
	{
		// Get the product
		final Product product = productService.getProductByCode(productCode);
		// Create a cart
		final Cart cart = cartService.createCart();
		// Add product to this cart
		return cartService.addToCart(cart, product);
	}
}
