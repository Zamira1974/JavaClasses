package com.review;
public class SubstringDemo {
public static void main(String[] args) {
	
	String longStr= "I am very happy today, because today is not Monday.";
	String anotherStr=longStr.substring(10);     //Starting from 10th parameters
	System.out.println(anotherStr);
	System.out.println(longStr.length());
	
	
	anotherStr=longStr.substring(10,15);
	System.out.println(anotherStr);              //happy
	
	//longStr.subSequence(20, 10);               //errors
	//longStr.substring(10, 56);                 //error, because length of the str is 51
	
	
}
}
