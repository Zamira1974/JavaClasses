package com.class4;

public class HomeWorkRepl {

	public static void main(String[] args) {
		// convert double 100.50 into int. Output should be 100

		double num=100.50;
		int value=(int)num;
		
	System.out.println(value);
		
	System.out.println("*****************");
	
	
	/* double d = 500.4444;
	long l = (new Double(d)).longValue();
	System.out.println(l); */
	
	
	double d = 500.4444;
	long l = (long) d;
	System.out.println(l);
	
	int a=5;
	int b=2;
	float c= (float) a/b;
	System.out.println("Result: "+c);
	
	System.out.println("*****************"); 
	
	  int a1=5;
	  int b1=2;
	  int c1=a/b;
	  
	  System.out.println("Result: "+c1);
	  
	
	
	}

}
