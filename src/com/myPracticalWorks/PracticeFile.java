package com.myPracticalWorks;

public class PracticeFile {

	public static void main(String[] args) {

		// 1. while loop
		int i = 1;

		while (i <= 9) {
			System.out.println(i);
			i++;
		}
		System.out.println("___________________");

		// 2. do while loop
		int j = 57;
		do {
			System.out.println(j);
			i++;
		} while (j <= 10);

		System.out.println("___________________");

		// 3. for loop
		for (i = 1; i < 40; i += 6) {
			System.out.println(i);
		}

		System.out.println("___________________");

		// 4.

		for (int a = 30; a >= 1; a -= 5) {
			System.out.println(a);
		}

		System.out.println("_________Jumping Statement - Break __________");

		// 5.
		for (i = 1; i <= 10; i++) {
			if (i == 8) {
				break;
			}
			System.out.println(i); // 1,2,3,4
		}

		System.out.println("_________Jumping Statement - Continue__________");

		// 6.
		for (i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i); // 1,2,3,4, 6,7,8,9,10
		}

		// 7.
		for (i = 1; i <= 10; i++) {
			if (i == 3 || i == 5 || i == 7) {
				continue;
			}
			System.out.println(i); // 1,2, 4, 6, 8,9,10
		}

		System.out.println("______________________");

		// 8.

		int num = 5, res;
		for (i = 0; i <= 10; i++) {
			System.out.println(res = num * i);
		}

		System.out.println("______________________");
		
		
		// 9. arrays
		int a[] = { 120, 203, 440, 555, 123 };  //declare an array without specifying size
		System.out.println("Length Of array " + a.length);
		
		System.out.println(a[2]);    //read specific values

		System.out.println("______________________");
		
		for(int t=0; t<=a.length-1; t++) {
			System.out.println(a[t]);
		}
		
		
	}
}
