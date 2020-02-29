package com.class15;

public class StringMethods {
public static void main(String[] args) {
	
	String str="Java classes at Syntax are awesome";
	str=str.replace("awesome", "great");
	System.out.println(str);
	
	str=str.replace("Git", "SDLC");   // if it does not find matches than don't do anything
	System.out.println(str);
	
	str=str.replace("a", "2134 56$%^ %%%");   // if it does not find matches than don't do anything
	System.out.println(str);
	
	//replaceAll --> specify regular expression
	//lets remove all special characters
	str=str.replaceAll("[^A-Za-z0-9]","");
	System.out.println(str);
	
	System.out.println("************************************");
	
	
	//split
	String myString="Java classes at Syntax are awesome";
	String[] array = myString.split("a");  //split means cut of the string's letter
	System.out.println(array.length);
	
	
	
	
	
}
}
