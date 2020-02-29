package com.class13;

public class RegularExpressions {

	public static void main(String[] args) {

		
		//print only text and not numbers
		
		String str="1254371328Hel7846598lo35345";
		System.out.println("=========================");
		
		
		System.out.println(str.replaceAll("[0-9]",""));      //Leave only text  Hello
		System.out.println(str.replaceAll("[a-zA-Z]", ""));   //Leave only numbers 1254371328784659835345
		System.out.println("=========================");
		
		//Remove everything expect text and numbers
		String str2="Hi#$%How#$%#$4356246";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));    //#$%#$%#$
		System.out.println("=========================");
		

		System.out.println(str2.replaceAll("\\W", ""));
		

		
	}
}
