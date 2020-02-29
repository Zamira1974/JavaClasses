package com.JavaIQ;
import java.util.Scanner;
public class PrimeNumber {
	
	public static void main(String[] args) {
	
		//7.Write a java program to check whether a given number is prime or not?

		Scanner sc=new Scanner(System.in);
	    
	    System.out.println("please enter a number");
	    int num = sc.nextInt(),  a=2;
	    
	   boolean flag = false;
	   while(a <= num/2)
	   {
	       // condition for non-prime number
	       if(num % a == 0)
	       {
	           flag = true;
	           break;
	       }
	       ++a;
	   }
	   if (!flag) {
	       System.out.println(num + " is a prime number.");
	   }else {
	       System.out.println(num + " is not a prime number.");
	}
	
	}

}
