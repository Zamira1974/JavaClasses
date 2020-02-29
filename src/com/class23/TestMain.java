package com.class23;

public class TestMain {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2 = new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);
		
		e1.showInfo();
		e2.showInfo();
		
		System.out.println("_______________________________");
		
		
		//watch Class CarObjects
		CarObjects toyotaCar= new CarObjects ("Toyota 2019", 25000, 100);
		toyotaCar.carStockValue();
		
		CarObjects bmwCar= new CarObjects ("BMW 2019", 13059.6, 50);
		bmwCar.carStockValue();
		System.out.println("_______________________________");
		
		
		//watch Class ShoppingStore
		ShoppingStore blanket=new ShoppingStore("Blanket", 49.99, 2);
		ShoppingStore mattress=new ShoppingStore("Mattress", 219.59, 2);
		
		double blanketTotalPrice = blanket.itemTotalPrice();
		double mattressTotalPrice = mattress.itemTotalPrice();
		double sumPurchase =blanketTotalPrice+mattressTotalPrice;
		
		System.out.println("You purchased "+sumPurchase+" Today");
	}
}
