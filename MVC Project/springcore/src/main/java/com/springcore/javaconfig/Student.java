package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private Samosa samosa;
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	public void hi() {
		this.samosa.price();
		System.out.println("Hi Student class");
	}
	public Samosa getSamosa() {
		System.out.println("");
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	

}
