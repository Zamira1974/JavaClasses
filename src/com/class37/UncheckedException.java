package com.class37;

public class UncheckedException {

	public static void main(String[] args) {
		
		System.out.println("Beginning of your code");
		int a=20;
		int b=0;
		
		try {
			System.out.println("I am code inside try block");
			System.out.println(a/b);  //new ArithmeticException();
			System.out.println("I am continius code inside try block");
			
		} catch (ArithmeticException e) { //ArithmeticException exception=new ArithmeticException();
			
			System.out.println("I am a code inside catch block");
			//e.printStackTrace();
			//System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of your code");
	}

}
