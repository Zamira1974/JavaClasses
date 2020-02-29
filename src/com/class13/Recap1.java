package com.class13;

public class Recap1 {

	public static void main(String[] args) {
	
		
		String city="Fairfax";
		String city1="FAirfax";	
		
		System.out.println(city.isEmpty());
		System.out.println(city.length());   //here length() is a method
		
		int [] a= {12,32,55,77};
		System.out.println(a.length);  //a.length does not apply ()brackets, because it is a variable
		System.out.println(city);
		String city2=city.toUpperCase();
		System.out.println(city2);
		
		
		System.out.println(city1);
}

}
