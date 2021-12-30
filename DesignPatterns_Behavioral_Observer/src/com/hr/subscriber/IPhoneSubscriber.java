package com.hr.subscriber;

public class IPhoneSubscriber implements Subscriber {

	private String name;
	
	public IPhoneSubscriber(final String name) {
		this.name = name;
	}
	
	@Override
	public void update(String phoneName) {
		System.out.println(this.name+ " : Got an update about this new iPhone launch >> "+phoneName);
	}
}
