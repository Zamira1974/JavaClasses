package com.myPracticalWorks;
import java.util.Scanner;
public class ScannerInput {

	public static void main(String[] args) {

		Scanner in= new Scanner(System.in);
		System.out.println("Give us a size.");
		int size =in.nextInt();
		
		int[] grades=new int[size];
		System.out.println("Enter "+size+ " numbers. Press enter"
				+ " after each");
			
	
			for(int i=0; i<size; i++) {
			grades[i]=in.nextInt();	
			in.close();
		}
		for (int i = 0; i < size; i++) {
			System.out.println(grades[i]);	
		}
	}
}
