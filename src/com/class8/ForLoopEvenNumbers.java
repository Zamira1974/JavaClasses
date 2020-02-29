package com.class8;

public class ForLoopEvenNumbers {

	public static void main(String[] args) {

		// print even numbers from 20 to 1 {2 ways}

		// 1st way
			for (int i1 = 20; i1 >= 1; i1 -= 2) {
					System.out.print(i1 + "  ");
				}

		System.out.println("***********************");

		
		// 2nd way
				for (int i=1; i<=20; i+= 2) {
					System.out.print(i + "  ");
				}
	
	
	}

}
