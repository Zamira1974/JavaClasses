package com.class32;

public class WrapperClasses {

	public static void main(String[] args) {

	int num=10;
	
	//Autoboxing --> converting primitive type into an Object type
	Integer integer=100000; 
	System.out.println(integer.MIN_VALUE);  //where MIN_VALUE - final static variables
	
	String str=integer.toString();
	System.out.println(str);
	
	// converting boolean primitive type into an Boolean Object type
	Boolean boolean1=true;
	Byte $b=20;
	System.out.println($b.MAX_VALUE);

	//AutoUnboxing --> converting Object type into a primitive type
	int num1=new Integer(10);
	System.out.println(num1);
	
	}
}