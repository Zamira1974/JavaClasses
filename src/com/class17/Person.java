package com.class17;
public class Person {
//Create a class named 'Main' with String variable 'name' and integer variable 'roll_no'. 
//Creating an object of the class Main and assign value of 2 to roll_no and name as "John"	

	String name;
	int roll_no;
		
	public static void main (String[] args) {
		
	Person p=new Person();
	p.name="John";
	p.roll_no=2;
	System.out.println("Name is "+p.name+" and roll number is "+p.roll_no);
	}
}

