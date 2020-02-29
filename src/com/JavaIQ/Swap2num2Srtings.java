package com.JavaIQ;
public class Swap2num2Srtings {
public static void main(String[] args) {
		
//1.Write a program to swap 2numbers without a temporary variable?
//Swap 2 strings without a temporary variable?		
	
	
	int a = 20;
	int b = 30;
	    
	String s1= "Hello";
	String s2= "World";
	
	System.out.println("Before swapping : a, b = "+a+", "+ b);
	       a = a + b;
	       b = a - b;
	       a = a - b;
	System.out.println("After swapping : a, b = "+a+", "+ b);
	  
	
	System.out.println("Before swapping : s1, s2 = "+s1+" "+s2);     
	    s1 = s1 + s2; 
	    s2 = s1.substring(0,s1.length()-s2.length()); 
	    s1 = s1.substring(s2.length()); 
	System.out.println("After swapping : s1, s2 = " +  s1 + " " + s2);

}}
