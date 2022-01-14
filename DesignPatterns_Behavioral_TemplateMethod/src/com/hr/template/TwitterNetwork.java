package com.hr.template;

public class TwitterNetwork extends SocialNetwork{

	@Override
	protected boolean login() {
		System.out.println("Login in to Twitter using 1234567890 and Pass@1234");
		return true;
	}
	
	@Override
	protected void logout() {
		System.out.println("Logging out from Twitter");
	}
}
