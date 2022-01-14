package com.hr.template;

public class FacebookNetwork extends SocialNetwork{

	@Override
	protected boolean login() {
		System.out.println("Login in to Facebook using abc@def.com and Pass@1234");
		return true;
	}
	
	@Override
	protected void logout() {
		System.out.println("Logging out from Facebook");
	}
}
