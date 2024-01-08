package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("1")
	private int id;
	@Value("abc")
	private String name;
	@Value("78")
	private double perc;
	@Value("m")
	private char gender;
	@Autowired
	private Laptop laptop;

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", perc=" + perc + ", gender=" + gender + ", laptop=" + laptop
				+ "]";
	}
}
