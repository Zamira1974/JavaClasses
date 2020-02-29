package com.class2;

public class LastExecise {

	public static void main (String[] args)  {
		
		int a=10;
		int b=22;
		
		String x="Hello";
		String y="Bye";
		
		
		System.out.println(a+b+x+y);     //32HelloBye
		System.out.println(a+y+b+x);     //10Bye22Hello
		System.out.println(x+y+a+b);     //string+number =concatination  ---  HelloBye1022
		System.out.println(x+y+(a+b));   // HelloBye32
		
	

int myNumber=15;
int stepOne=myNumber*myNumber;

int stepTwo=stepOne+myNumber;
int stepThree=stepTwo/myNumber;
int stepFour=stepThree+17;
int stepFive=stepFour-myNumber;
int stepSix=stepFive/6;


System.out.println("The magic number is "+stepSix+ "!");

	}
	
	
}
