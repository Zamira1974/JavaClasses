package com.class11;

public class TwoDimentialArrays {

	public static void main(String[] args) {
		// Declare 2D dimential Array

		// 1.
		int[][] array = new int[3][4];

		// 1st row
		array[0][0] = 44;
		array[0][1] = 80;
		array[0][2] = 33;
		array[0][3] = 20;

		// 2nd row
		array[1][0] = 10;
		array[1][1] = 5;
		array[1][2] = 7;
		array[1][3] = 8;

		// 3rd row
		array[2][0] = 10;
		array[2][1] = 9;
		array[2][2] = 70;
		array[2][3] = 80;
		System.out.println(array[1][3]);

		// 2.Task: create 2d array of String with 2 rows & 3 columns

		String[][] arr = new String[2][3];

		arr[0][0] = "Dog";
		arr[0][1] = "Cat";
		arr[0][2] = "Mouse";

		arr[1][0] = "Pig";
		arr[1][1] = "Cow";
		arr[1][2] = "Zebra";
		System.out.println(arr[1][2]);
		System.out.println("***************");

		// 3. 3row & 5 columns
		int[][] numbers = { 
				{ 8, 7, 6, 5, 4, 2 },
				{ 6, 3, 1, 7, 9, 0, 6 }, 
				{ 3, 5, 7, 8, 4, 0 } 
				};
		
		System.out.println(numbers[1][4]);
		System.out.println("***************");

		// To identify the numbers of Rows
		System.out.println("The numbers of rows are:= " + numbers.length);

		// To identify the numbers of Columns /elements' in the row
		System.out.println("The numbers in the row are:= " + numbers[0].length); // 6 elements in 1st row
		System.out.println("The numbers in the row are:= " + numbers[1].length); // 7 elements in 2st row
		
		System.out.println("====================");
		
		
		//4.
		//1st way
		int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
				
				sum=sum+numbers[i][j];
			}
			System.out.println();
		}
		System.out.println("The sum of all elements in the array is= "+sum);
		
		
		//2nd way
		int sum1=0;
		for(int nums[]: numbers) {
			for(int getNum:nums) {
				
				if(getNum%2==0) {
					System.out.println(getNum+ " is even number");
				}
				sum1=sum1+getNum;
			}
		}
		System.out.println("The sum of all elements in the array is= "+sum1);
		
	}

}
