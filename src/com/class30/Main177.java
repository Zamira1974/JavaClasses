package com.class30;

public class Main177 implements FirstInterface, SecondInterface {

	@Override
	public void firstMethod() {
		System.out.println("First Method implementing multiple Inheritance");
	}
	@Override
	public void secondMethod() {
		System.out.println("Second Method implementing multiple Inheritance");	
	}
	
	public static void main(String[] args) {
		Main177 obj=new Main177();
		obj.firstMethod();
		obj.secondMethod();
	}	
}
