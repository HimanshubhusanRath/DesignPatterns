package com.hr.template;

public abstract class SocialNetwork {

	/* Template Method */
	public void postMessage(final String message)
	{
		System.out.println("\n==== Connect and post message ====");
		if(login())
		{
			postMsg(message);
			logout();
		}
	}

	protected void postMsg(String message) {
		System.out.println("Posting this message now : "+message);
	}

	protected abstract boolean login();
	protected abstract void logout();
}
