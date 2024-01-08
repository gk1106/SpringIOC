package com.cage;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cat implements Animal {

	public void sound() {
		System.out.println("Cat says meow meow");
	}

}
