package com.myPracticalWorks;

public class MethodOverloading {

	void add(int a, int b)     		    //1.every method is unique
	{
		System.out.println(a+b);
	}
	
	void add(int a, double b)		    //2.every method is unique
	{
		System.out.println(a+b);
	}
	
	void add(double a, double b)		 //3.every method is unique
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c)		 //4.every method is unique
	{
		System.out.println(a+b+c);
	}
	
	
	
	public static void main(String[] args) {
		
		MethodOverloading mo= new MethodOverloading();
		mo.add(10, 20);    	 //1
		mo.add(10,20,30); 	 //4
		mo.add(10,20.5);  	 //2
		mo.add(10.52, 10.64);  //3

	}

}
