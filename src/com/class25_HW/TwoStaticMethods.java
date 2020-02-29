package com.class25_HW;

public class TwoStaticMethods {

	static void statMeth() {
		System.out.println("Method without parameter");
	}
	static void statMeth(int param) {
		System.out.println("Method with int parameter");
	}
	
	public static void main(String[] args) {
		statMeth();
		statMeth(5);
	}
	
}
