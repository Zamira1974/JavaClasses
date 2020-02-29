package com.class10;

public class ArraysHW073 {

	public static void main(String[] args) {

	//1st way.
	
	int[] nums = new int [5];
	nums[0]=45;
	nums[1]=78;
	nums[2]=12;
	nums[3]=67;
	nums[4]=55;	 
		
	System.out.print(nums[0]+" "+nums[1]+" "+nums[2]+" "+nums[3]+ " "+nums[4]);
	
	System.out.println();
	System.out.println("***************************************");
	
	//2nd way.
	
	int[] arr = { 45, 78, 12, 67, 55 };

	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
  }
}
