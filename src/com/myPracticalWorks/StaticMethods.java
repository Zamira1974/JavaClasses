package com.myPracticalWorks;

public class StaticMethods {

	public static void main(String[] args) {
	int x=10;
	int y=20;
		System.out.println(Integer.max(x, y));	
		System.out.println(Integer.compare(x, y));

		
		String money = "300";
		System.out.println(Integer.valueOf(money));    //object
		System.out.println(Integer.parseInt(money));   //primitive
	}
}
