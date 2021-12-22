package com.hr.client;

import com.hr.facade.CartFacade;

public class FacadeClient {

	public static void main(String[] args) 
	{
		final CartFacade cartFacade = new CartFacade();
		System.out.println(cartFacade.addProductToCart("P1"));
	}
}
