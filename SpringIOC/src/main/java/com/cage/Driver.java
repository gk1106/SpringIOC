package com.cage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
        
		ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
		Cage cage = con.getBean(Cage.class,"cage");
		cage.sound();
		
		
		
		
	}

}
