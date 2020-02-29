package com.class10;

public class ArrayGrades {

	public static void main(String[] args) {
		
	//1.	
//		char[] grades = new char[6]; 
//		grades[0] = 'A';
//		grades[1] = 'B';
//		grades[2] = 'C';
//		grades[3] = 'D';
//		grades[4] = 'E';
//		grades[5] = 'F';
//		
//		System.out.println(grades[1]);
	
	//2. 	
		
		char[] grades = {'A','B','C','D','E','F'};
		
		
		int a=2;
		System.out.println(grades[4]);
		System.out.println(grades[a]);
		
		a+=2; // 2+2
		System.out.println(grades[a]);
		a--; //3
		System.out.println(grades[a]);
		
		System.out.println("_______________________________");
		
//		System.out.println(grades[0]);
//		System.out.println(grades[1]);
//		System.out.println(grades[2]);
//		System.out.println(grades[3]);
//		System.out.println(grades[4]);
		
		
		for (int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}
		
		
		String[] animals = {"Cat", "Dog", "Cow", "Snake", "Elephant"};
		int size=animals.length;
		
		for (int i=0; i<size; i++) {
			System.out.println(animals[i]+" ");
		}
		
		System.out.println("_______________________________");
		
		
		//3. create an array to store 5 double values, print all in 1 line
		
		double [] num = {0.1, 2.5, 6.3, 8.2, 15.3};
		int size1 = num.length;
		for (int i=0; i<size1; i++) {
			System.out.print(num[i]+"  ");
		}
		
		
		
		
	}

}
