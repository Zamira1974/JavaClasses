package com.myPracticalWorks;

public class ConstructorOverloading {

	
		ConstructorOverloading(int a, int b)     		    //1  
		{
			System.out.println(a+b);
		}
		
		ConstructorOverloading(int a, double b)		 		//2
		{
			System.out.println(a+b);
		}
		
		ConstructorOverloading(double a, double b)		 	//3
		{
			System.out.println(a+b);
		}
		
		ConstructorOverloading(int a, int b, int c)		 	//4
		{
			System.out.println(a+b+c);
		}
		
		
		
		public static void main(String[] args) {
	//		ConstructorOverloading co= new ConstructorOverloading(10, 20);       //1
	//		ConstructorOverloading co= new ConstructorOverloading(10, 33.7);     //2
    //		ConstructorOverloading co= new ConstructorOverloading(11.9, 45.8);   //3		
			ConstructorOverloading co= new ConstructorOverloading(10, 55, 99);   //4
			
			
			
	}

}
