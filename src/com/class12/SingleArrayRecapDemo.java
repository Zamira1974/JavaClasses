package com.class12;

public class SingleArrayRecapDemo {

	public static void main(String[] args) {

	int [] array1=new int[4];
	array1[0]=12;
	array1[1]=13;
	array1[2]=15;
	array1[3]=18;
	
	// System.out.println(array1[2]);
	
	
	int num1=0;
	for (int i = 0; i < array1.length; i++) {
		
		num1=num1+array1[i];
		System.out.println(array1[i]);
	}
	System.out.println("The sum of Array1 is = "+num1);
	
	
	System.out.println("============================");
	
	
	for(int i:array1) {                   //Retrieve values from array's list
		System.out.println(i);
	}
	
}
}
