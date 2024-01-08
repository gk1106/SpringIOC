package com.student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Value("1")
	private int id;
	@Value("ASUS")
	private String name;
	@Value("8")
	private double ram;
	@Value("512")
	private double rom;

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", ram=" + ram + ", rom=" + rom + "]";
	}

}
