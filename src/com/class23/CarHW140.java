package com.class23;

public class CarHW140 {
	
	String make="Toyota";
	String model;
	int numberOfDoors;
	int topSpeed;
	double price;
	
	CarHW140(String make, String carModel, int carNumOfDoors, int carSpeed, int carPrice) {
		model=carModel;
		numberOfDoors=carNumOfDoors;
		topSpeed=carSpeed;
		price=carPrice;
	}
	CarHW140(String make, String carModel, int carSpeed, int carPrice) {
		numberOfDoors=4;
		model=carModel;
		topSpeed=carSpeed;
		price=carPrice;
	}
	CarHW140(int carNumOfDoors,int carSpeed, int carPrice) {
		make="unknown";
		model="unknown";
		numberOfDoors=carNumOfDoors;
		topSpeed=carSpeed;
		price=carPrice;
	}
	CarHW140 (String make, String carModel, int carNumOfDoors) {
		model=carModel;
		numberOfDoors=carNumOfDoors;
		topSpeed=90;
		price=0;
	}
	
	public void display() {
		System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+ price );
	}
	
}
