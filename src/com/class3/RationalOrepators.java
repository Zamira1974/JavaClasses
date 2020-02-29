package com.class3;

public class RationalOrepators {

	public static void main(String[] args) {

		int num1=20;
		int num2=19;
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("*************&&&&********");
	
	double d=1.99;
	double d1=2.99;
	
	boolean b5=d>d1;
	System.out.println(b5);

	boolean b1=d<d1;
	boolean b2=d==d1;
	boolean b3=d!=d1;
	
	System.out.println(b1);  //true
	System.out.println(b2);  //false
	System.out.println(b3);  //true
	System.out.println("**********************");
	
	
	int a=90;
	int b=300;
	// if number a is bigger than number b
	// I want to print a is larger than b
	
	if (a>b)  {
		System.out.println("a is larger than b");
	}  else {
		System.out.println("a is smaller than b");	
	}
	
	int expectedHours=15;
	int actualHours=2;
	//if expected hours are more that actual --> you will succeed
	//otherwise, please study more
	
	if(actualHours>expectedHours) {
		System.out.println("You will succeed");	
	} else {
		System.out.println("please study more");	
	}
	System.out.println("***********************");
	
	
	
	double teaPrice=4.99;
	double allowedPrice=3.99;
	teaPrice-=2;  //2.99=4.99-2
	
	//if price is more that I can afford I will NOT buy
	//if price is less or matches what I can afford then I will by tea
	
	if (allowedPrice>=teaPrice ) {
		System.out.println("I will buy tea");
		System.out.println("And I will enjoy my tea");
	}
  else {
	  System.out.println("I cannot afford, I need to study more");
  }
	 
	System.out.println("I keep writting some code"); 
	System.out.println("I keep writting more code"); 
	
	
	boolean val=false;
	if(val) { //if val==true  
		System.out.println("Hello"); 
	} else {
		System.out.println("Bye"); 	
	}
	
	
	boolean isRain=true;
	//if it is raining I will take umbrella, otherwise I GO FOR A WALK
	
	if (isRain) { //isRain==true
		System.out.println("I will take umbrella"); 
	}
	else {System.out.println("I go for a walk");
	}
	
	}
}
