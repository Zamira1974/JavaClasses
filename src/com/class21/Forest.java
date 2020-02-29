package com.class21;

public class Forest {

/**Create four classes: Forest, Wolf, Fox, Bear
Class wolf has: color, age, numberOfWolves
Class fox has: color, speed, numberOfFoxes
Class bear has: type, weight, numberOfBears
Forest has main method
Create different objects/instances of different classes
At the end, print the total for each animal. */
	
	public String color ;
	public int speed; 
	public static int numberOfWolves, numberOfFoxes, numberOfBears;
	
	
	public static void main(String[] args) {
		Forest s1 = new Forest();
		s1.color="Grey"; 
		s1.speed=40;
		Forest.numberOfWolves=5;
		
		Forest s2=new Forest();
		s2.color="Orange";
		s2.speed=30;
		Forest.numberOfFoxes=10;
		
		Forest s3= new Forest();
		s3.color="Brown";
		s3.speed=10;
		Forest.numberOfBears=3;
		
		System.out.println("The total number of wolves "+Forest.numberOfWolves);
		System.out.println("The total number of wolves "+Forest.numberOfFoxes);
		System.out.println("The total number of wolves "+Forest.numberOfBears);
	}	
}
	
	

