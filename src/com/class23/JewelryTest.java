package com.class23;

public class JewelryTest {

	public static void main(String[] args) {
		
	
	Jewelry.make="Swarovsky";
	Jewelry ring=new Jewelry("Gold", 8, 250);
	ring.displayDetails();
	
	Jewelry niclace=new Jewelry(null, 0, 0);
	niclace.color="Silver";
	niclace.size=7;
	niclace.price=300;
	niclace.displayDetails();
	
	}	
}
