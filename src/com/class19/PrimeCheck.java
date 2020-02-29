package com.class19;

public class PrimeCheck {

	//write a method to return whether given number is prime or not?
	
	boolean isPrime (int num) {
		
		boolean isPrime=true;
		
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}else {
				isPrime=true;
			}
		} return isPrime;
	}
	
	public static void main(String[] args) {
		PrimeCheck obj=new PrimeCheck ();
		boolean a=obj.isPrime(11);
		System.out.println("The number is Prime: "+a);
		
	}
}
	

