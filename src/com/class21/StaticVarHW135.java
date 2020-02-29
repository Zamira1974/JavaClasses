package com.class21;
//We declare two static variables as show in assignment
//static int age; 
//static String name; 
//
//Create a static method and inside it write the logic follow the steps. 
//Step 1: Assign values to the static variables. as below. 
//age = 40;
//name = John
//Step 2: Print out the values on each variables one by one. 
//hint: Do not create an object
//Output:
//40
//John

public class StaticVarHW135 {
	static int age;
	static String name;

	static void display() {
		age = 40;
		name = "John";
		System.out.println(age);
		System.out.println(name);
	}
	
public static void main(String[] args) {
	display();
	}
}
