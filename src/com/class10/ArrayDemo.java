package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// int[] nums = new int [2147483364];  == max number 

		int[] nums = new int[4];
		nums[0]=12;
		nums[1]=13; 
		nums[0]=14;
		nums[3]=15;
		// to find numbers
		System.out.println(nums.length);
		System.out.println(nums[0]);
		
		String[] array = {"Winter", "Fall", "Summer", "String"};
		//I was born in Summer
		System.out.println("I was born in "+array[2]);
		
		//array.legth will return an integer
		int arraySize=array.length;
		System.out.println(arraySize);
		
		
		int[] score = {80, 90, 70, 100, 99};
		
		
		
		
	}
}
