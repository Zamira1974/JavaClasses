package com.syntax.review11;

public class American extends Human {
	String SSN;
	
	public American(String name, int age, int weight, String SSN) {
		super(name, age, weight);
		this.SSN=SSN;	
	}
	
	public void makeTaxReturns() {
		System.out.println("I am doing my tax return.");
	}

	@Override
	public String greeting() {
		return "Hello";
	}

	@Override
	public void talk() {
		System.out.println("I speak English. My name is "+name);
		System.out.println("My SSN is "+SSN);
	}
}
