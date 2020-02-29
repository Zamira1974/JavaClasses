package com.class13;

public class FibonachiNumbers {

	public static void main(String[] args) {
		
		//8.Write a Java Program to print first 10 numbers of Fibonacci series.
		 
		int num1=0,num2=1,num3,i,count=10;
				   
		 System.out.print(num1+" "+num2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  num3=num1+num2;    
		  System.out.print(" "+num3);    
		  num1=num2;    
		  num2=num3;    
		 }    
		  
		} 
	}


