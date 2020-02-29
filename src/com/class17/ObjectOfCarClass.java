package com.class17;
public class ObjectOfCarClass {
public static void main(String[] args) {
	
	// to create an object syntax is
	//ClassName variable=new ClassName();
	//Scanner scan=new Scanner(System.in);
	//String str=new String();
	
	Car car1=new Car();
	car1.make="Tesla";
	car1.model="S3";
	car1.color="Black";
	car1.year=2020;
	car1.wheels=4;
	car1.windows=5;
	car1.speed=200;
	//accessing behavior for 1st object
	car1.drive();  //method
	car1.start();
	car1.accelerate();
	
	System.out.println("-----------------");
	
	Car car2=new Car();
	car2.make="Toyota";
	car2.model="Highlander";
	car2.color="Black Pearl";
	car2.year=2018;
	car2.wheels=4;
	car2.windows=7;
	car2.speed=350;
	
	//accessing behavior for 2st object
	car2.drive();
	car2.start();
	car2.accelerate();
	
	//print features of the car
	//I have black Tesla
	System.out.println("I have "+car1.color+ " " + car1.make);
	//I drive Toyota 2018
	System.out.println("I drive "+car2.make+ " "+car2.year);

	
}
}
