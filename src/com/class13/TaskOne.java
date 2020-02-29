package com.class13;

public class TaskOne {

	public static void main(String[] args) {

//1. Create a String that will hold a sentence. 
//Write a program to get a new String without any spaces.

		
	String str="A Java keyword used in a class definition to specify that a class is not to be  "
			+ "instantiated, but rather inherited by other classes.";
		
	String [] array1=str.split(" ");
	for(int i=0; i<array1.length; i++) {
		System.out.print(array1[i].trim());  
	}	System.out.println();
		
	//2.Create a String that should be combination of letters, 
	//numbers and special characters. Find out how many alpha characters are there 
	//in the String.
	
	String str1="$%^&*HelloWor012936514ld9086$$%";
	System.out.println(str1.replaceAll("[^a-zA-Z0-9]", "").length());
	
	
	//3.You have a String a=”Is it Saturday? Is it raining?
	//Do we have a Java Class today?” How would you find out how many sentences 
	//are in that String?
	
	String str2="Is it Saturday? Is it raining?";
	String[] array2=str2.split("\\.");
	System.out.println("The number of Sentences in the given String is:: "+array2.length);
	}}


