package com.syntax.review9;
public class ConstructorsDemo {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.displayInfo();

		car1.make = "Honda";
		car1.color = "Red";

		car1.displayInfo();

		System.out.println();

		Car car2 = new Car("Toyota");
		car2.displayInfo();
//		car2.make = "Toyota";
		car2.color = "Grey";
		car2.displayInfo();

		System.out.println();

		Car car3 = new Car("Jeep", "Blue");
		car3.displayInfo();
		
		
		//down script related with class: SuperCar
		SuperCar car11 =new SuperCar();
		car11.make="Jeep";
		car11.brand="Grand Cherokee";
		car11.manufacture="Chrysler";
		
		SuperCar obj1=new SuperCar();
		System.out.println("Tire number is: "+obj1.SuperCar(255)+" and car mass is: "+ obj1.SuperCar(1400));

		car11.showInfo();
		
		
		
		
	}
}