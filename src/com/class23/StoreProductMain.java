package com.class23;

public class StoreProductMain {

	public static void main(String[] args) {
		StoreProduct p1=new StoreProduct("Eggs", 3, "Produce ", true, 10);
		StoreProduct p2=new StoreProduct("Paper Towels", 2, 24);
		StoreProduct p3=new StoreProduct("Paper Towels", 2);
		
		p1.display();
		p2.display();
		p3.display();
	}	
}
