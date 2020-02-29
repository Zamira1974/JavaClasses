package com.class23;
public class StoreProduct {

	String label;
	double price; 
	String category;
	boolean hasExpiration; 
	int stock; 
	
	StoreProduct(String pLabel, int pPrice, String pCategory, boolean pHasExpiration, int pStock) {
		label=pLabel;
		price=pPrice;
		category=pCategory;
		hasExpiration=pHasExpiration;
		stock=pStock;	
	}
	StoreProduct(String pLabel, int pPrice, int pStock) {
		label=pLabel;
		price=pPrice;
		category ="misc";
		stock=pStock;
	}
	StoreProduct(String pLabel, int pPrice) {
		label=pLabel;
		price=pPrice;
	}

	public void display() {
		System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}	
}
