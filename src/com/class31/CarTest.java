package com.class31;

public class CarTest{
	public static void main(String[] args) {
		System.out.println("-----------Car-----------");
		Car car=new Car(2000, "blue");
		System.out.println(car.calculateSalesPrice());
		
		System.out.println("-----------Sedan-----------");
		Sedan sedan=new Sedan(2000, "pink", 30);
		System.out.println(sedan.calculateSalesPrice());
		System.out.println(sedan.calculateSalesPrice());
		
		System.out.println("-----------Truck-----------");
		Truck truck = new Truck(2000, "grey", 3000);
		double price=truck.calculateSalesPrice();
		System.out.println(price);	
	}
}