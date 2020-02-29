package com.class37;

public class ExceptionIntro {

	public static void main(String[] args) {
		
	int a=20;
	//int b=0;
	int b=10;
	System.out.println(a/b);//When exception occurs, that disrupts your execution
	// your code on line 12, never will execute
	System.out.println("Code after an exception");
	
	int[] array = {10, 20, 30};
	System.out.println(array[3]);  //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
								   //at com.class37.ExceptionIntro.main(ExceptionIntro.java:15)

	ArithmeticException exception=new ArithmeticException();
	throw(exception);
	
	
	}

}
