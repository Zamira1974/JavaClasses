package com.class25_HW;

public class FinalMethod {

	void finalM (boolean value) {
		System.out.println("Final method with boolean parameter");
	}
	void finalM (String value) {
		System.out.println("Final method with String parameter");
	}
	
	public static void main(String[] args) {
		FinalMethod obj = new FinalMethod();
		obj.finalM(false);
		obj.finalM("Hello");
	}	
}
