package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {

		
		int a;
		a=10;
		
		int a1=10; 
		
		int c[]; 
		
		//1 way
		int[] b;       //declare an array  -- preferred way 
		b=new int[4];  //this array holding 4 elements
		
		//2 way --> all in 1 line (declaration & initialization)
		int [] array=new int[4]; 
	
		
		int [] nums=new int[3];
		nums[0]=1;
		nums[1]=2; 
		nums[2]=3;
		// how can change 1 to 100;
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]); //100+3
		
		//the size of an array is fixed
		
		String[] names = new String[4];
		names[0]="Diana";
		names[1]="Seda";
		names[2]="Jaime";
		names[3]="Olga"; //during run time we will get an exception
		//ArrayIndexOutOfBoundsException
		
		System.out.println(names[3]); 
		
		//we are putting less elements inside
		// --> compiler will give default values
		
		double [] numbers = new double[4];
		numbers[1]=100;
		numbers[3]=200;
		System.out.println(numbers[0]); 
		
	}

}
