package com.myPracticalWorks;

public class StringMethods {

	public static void main(String[] args) {
	
		String s="welcome";
		String s1="to java";
		
		System.out.println(s.length());      //length of string
		
		System.out.println(s.concat(s1));    //joining of strings
		
		s="    welcome    ";
		System.out.println(s);
		
		System.out.println("After trimming string is: " + s.trim());    // trim - cuts the spaces

		
		//comparing strings equals()
		s="Welcome";
		System.out.println(s.equals("Welcome"));      //true
		System.out.println(s.equals("Wel  come"));    //false
		System.out.println(s.equals("welcome"));      //false
		
		//replace characters
		s="Welcome to Java";
		System.out.println(s.replace('o', 'i'));            //Welcime ti Java
		
		System.out.println(s.replace("Java", "selenium"));  // Welcome to selenium
		
		
		//Substrings()
		s="Welcome";
		System.out.println(s.substring(0,4));        // Welc
		
		//Lower Case
		s="WELCOME";
		System.out.println(s.toLowerCase());          //welcome
		
		//Upper Case
		s="welcome";
		System.out.println(s.toUpperCase());          //WELCOME
		
	}
}
