package com.myPracticalWorks;

public class Robot {
	String name, color;
	int weight;

	void introduceSelf1() {
		System.out.println("My name is " + this.name);
	}
	void introduceSelf() {
		System.out.println("My name is " + this.name);
	}

	Robot(String n, String c, int w) {
		this.name=n;
		this.color=c;
		this.weight=w;
	}
	
	public static void main(String[] args) {
		Robot r1 = new Robot("Tom", "Red", 30);
		Robot r2 = new Robot("Jerry", "blue", 40);
		
		r1.introduceSelf();
		r2.introduceSelf();
	
		
		
	}
}
