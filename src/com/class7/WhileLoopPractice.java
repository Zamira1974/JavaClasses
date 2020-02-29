package com.class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int i = 1;
		while (i <= 20) {
			System.out.println(i);
			i++;
		}

		// I want to print numbers from 10 to 30 al in 1 line

		int y = 10;
		while (y <= 30) {
			System.out.print(y+" ");
			y++;
		}
		//how to print values 10 to 1
		
		int a=10;
		while(a<=1) {
			System.out.println(a);
			a--;
		}  
		
		int z=50;
		while (z>=20) {
			System.out.println(z+" ");
			z--;
		}
		
		System.out.println("------------------------------------------");
		
		
		// I want to print all even numbers from 1 to 20
		// 1st way increment value by 2
		
		//1st way
		int t=2;
		while (t<=20) {
				System.out.println(t);
				t+=2;
				}
		
		//2nd way using modulus
		int q=2;
		
		while (q<=20) {
			System.out.println(".");
			if (q%2==0) {
				System.out.println(q);
			}
			q++;
		}
		
		System.out.println("*********************************************");
		
		
		//Print only odd number from 50 to 100
		int k=51;
		
		while (k<100) {
			System.out.println(k);
			k+=2;
		}
		
	}

}
