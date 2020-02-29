package com.class9;

public class Piramid {

	public static void main(String[] args) {

//1.
//		*
//		**
//		***
//		*****
//		******

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//2.
//	1
//	22
//	333
//	4444
//	55555
//	666666
//  7777777
//  88888888
//  999999999

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

//3.	
//	1
//	12
//	123
//	1234
//	12345

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

//4.
//  999999999
//  88888888
//  7777777		
//	666666		
//	55555		
//	4444		
//	333
//	22		
//	1		
		for (int a = 9; a >= 1; a--) {
			for (int b = 1; b <= a; b++) {
				System.out.print(a);
				}
			System.out.println();
		}
		System.out.println("........................");

//5.	
//  55555
//	4444
//	333
//	22
//	1

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
			}

	}
}
