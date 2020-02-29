package com.class11;

public class ClassTasks1 {

	public static void main(String[] args) {
		
//Create an array of cars and store 6 elements into it.
//Using 2 different loops print all values from the array.
		
		

	//1st way
		String[] cars= {"Audi", "Toyota", "BMW", "Honda", "Hyndai","Tesla"};
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("-------------------");
	
	//2nd way
		for(String element:cars) {
			System.out.println(element);
		}
	
	}}


