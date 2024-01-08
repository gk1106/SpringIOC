package com.cage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cage {
	@Autowired
	@Qualifier(value = "dog")
	Animal animal;

	public void sound() {
		animal.sound();
	}
}
