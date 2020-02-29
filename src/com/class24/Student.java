package com.class24;

//Write program as a Student class that has instance variables name and address. Create a constructor that will initialize those variables.
//Print name & address of given  student by the displayInfo method.

public class Student {
   
	public static String name;
	public String address;
	
	Student(String studentName, String studentAddress) {
		name=studentName;
		address=studentAddress; 
	}

	public void displayInfo() {
  		System.out.println("Student name is "+name+" and address is: "+address);
  	}
	
	
	public static void main(String[] args) {
		name="Alisher";
		Student obj = new Student(name, "Jacksonville, Florida");
		obj.displayInfo();
	}
	
  	
    
}
