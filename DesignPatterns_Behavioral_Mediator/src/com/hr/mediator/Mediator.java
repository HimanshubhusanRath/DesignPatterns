package com.hr.mediator;

import com.hr.entities.Fan;
import com.hr.entities.Switch;

public interface Mediator {

	void addSwitch(final Switch switchh);
	void addFan(final Fan fan);
	void press();
}
