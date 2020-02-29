package com.class15;

public class StringManipulationsRECAP {
public static void main(String[] args) {
	
	//String class comes in java lang package
	
	//2 way to create a String
	//1st way using literal
	String str="Hello";
	//2nd way using new keyword - creating a String object
	String str1=new String("hello");
	System.out.println(str);
	System.out.println(str1);
	
	System.out.println("*******************************");
	
	int length=str1.length();
	System.out.println(length);
	// case conversion methods/functions
	
	str=str.toLowerCase().toUpperCase();      //HELLO
	System.out.println(str);    //HELLO
	
	//verify if there is the String is Empty
	String myString="";   //empty value
	boolean isEmpty=myString.isEmpty();
	System.out.println(isEmpty);
	
	System.out.println("*******************************");
	
/*	String myString1=null;    //"null" means - no value at all it is equal to
	//String myString1;
	System.out.println(myString1.isEmpty());  */
	
	
	//how to verify existence of characters in the string
	String a="Good evening students";
	boolean exist=a.contains("student"); 
	System.out.println(exist);
	
	System.out.println("*******************************");
	
	
	System.out.println(a.startsWith("Good"));
	System.out.println(a.startsWith("student"));
	
	
	
	
}
}
