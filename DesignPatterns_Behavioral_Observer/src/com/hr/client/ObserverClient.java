package com.hr.client;

import com.hr.publisher.IPhonePublisher;
import com.hr.subscriber.IPhoneSubscriber;
import com.hr.subscriber.Subscriber;

public class ObserverClient {

	public static void main(String[] args) {
		// Define publisher
		IPhonePublisher publisher = new IPhonePublisher();
		
		// Define subscribers
		Subscriber sub1 = new IPhoneSubscriber("Sub-1");
		Subscriber sub2 = new IPhoneSubscriber("Sub-2");
		Subscriber sub3 = new IPhoneSubscriber("Sub-3");
		Subscriber sub4 = new IPhoneSubscriber("Sub-4");
		Subscriber sub5 = new IPhoneSubscriber("Sub-5");
		
		// Add subscribers to the publisher
		publisher.addSubscriber(sub1);
		publisher.addSubscriber(sub2);
		publisher.addSubscriber(sub3);
		publisher.addSubscriber(sub4);
		publisher.addSubscriber(sub5);
		
		// Launch a new phone
		publisher.launchNewPhone("IPhone-X");
		
		// Remove few subscribers
		publisher.removeSubscriber(sub1);
		publisher.removeSubscriber(sub2);
		
		// Launch a new phone
		publisher.launchNewPhone("IPhone-Y");

	}

}
