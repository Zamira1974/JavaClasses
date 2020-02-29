package com.class23;

/*Write a program that will have a constructor: 
 * one with parameters and second without any 
 * parameters. Create a separate Test class where 
 * you will execute both of the constructors. 
 */

public class Jewelry {

	static String make;
	public String color;
	public int size;
	public int price;
	
	
Jewelry(String jewColor, int jewSize, int jewPrice) {
	color=jewColor; 
	size=jewSize;
	price=jewPrice;
}	

public void displayDetails() {
	System.out.println("The Jewelry "+make+" has a color "+color+ ", size: "+size+", price: "+price);
}
	
	
	
	
	
}
