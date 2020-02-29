package com.review;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		//read the array size from scanner
		//create an array of numbers
		//insert values of integers from the scanner
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to add?");
		int size = sc.nextInt();
		
		int[] array =new int[size];
			
		for(int i=0; i<size; i++) {
			System.out.println("Enter a number:");
		array[i] = sc.nextInt();
		}
		int sum=0;
		for (int i=0; i<size; i++) {
			sum+=array[i];
		}
			System.out.println("The sum is " + sum);
		}
		
		
	}

