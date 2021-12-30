package com.hr.publisher;

import java.util.ArrayList;
import java.util.List;

import com.hr.subscriber.Subscriber;

public class IPhonePublisher {

	private String phoneName;
	private List<Subscriber> subscribers = new ArrayList<>();
	
	public void addSubscriber(final Subscriber subscriber)
	{
		this.subscribers.add(subscriber);
	}
	
	public void removeSubscriber(final Subscriber subscriber)
	{
		this.subscribers.remove(subscriber);
	}
	
	public void launchNewPhone(final String phoneName)
	{
		this.phoneName = phoneName;
		notifySubscribers(phoneName);
	}

	// Notify all subscribers about the change
	private void notifySubscribers(String phoneName) {
		System.out.println("\n---- New phone is released now -----");
		for(Subscriber sub : this.subscribers)
		{
			sub.update(phoneName);
		}
	}
}
