package com.cage;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

	public void sound() {
		System.out.println("Dog says bow bow");
	}

}
