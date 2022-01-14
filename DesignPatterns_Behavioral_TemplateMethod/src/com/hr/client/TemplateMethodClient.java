package com.hr.client;

import com.hr.template.FacebookNetwork;
import com.hr.template.SocialNetwork;
import com.hr.template.TwitterNetwork;

public class TemplateMethodClient {

	public static void main(String[] args) {
		SocialNetwork facebook = new FacebookNetwork();
		facebook.postMessage("Happy Birthday Amar");
		
		SocialNetwork twitter = new TwitterNetwork();
		twitter.postMessage("Happy Work Anniversary Rahul");
	}

}
