package com.hr.client;

import com.hr.context.MobilePhone;
import com.hr.states.AbstractState;
import com.hr.states.ActiveState;
import com.hr.states.LockedState;

public class StateClient {

	public static void main(String[] args) {
		AbstractState state = new ActiveState();
		MobilePhone mobile = new MobilePhone(state);
		System.out.println("\n======== ACTIVE STATE ==========\n");
		// Try out the operations
		mobile.makeCall();
		mobile.pressAnyKey();
		
		// Change the state
		System.out.println("\n======== LOCKED STATE ==========\n");
		mobile.setState(new LockedState());
		// Try out the operations
		mobile.makeCall();
		mobile.pressAnyKey();
		
	}

}
