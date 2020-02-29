package com.syntax.review11;

public class Kazakh extends Human {
	String kazakhFood;
	
	public Kazakh( String name, int age, int weight, String kazakhFood) {
		super(name, age, weight);
		this.kazakhFood=kazakhFood;
	}

	public Kazakh() {
		
	}
	
	public void Kazakh() {
		System.out.println("Kazakhtan have a national food.");
	}
	
	
	@Override
	public String greeting() {
		return "Salemetsizbe!";
	}

	@Override
	public void talk() {
		System.out.println("Jumistarynyz jaksy ma?");	
	}
	
	public void kazakhFood() {
		System.out.println("Kazy is national kazakh food.");
	}
} 

