package com.class10;

public class DividedNumHW081 {

	public static void main(String[] args) {

	int[] nums= {45,78,12,67,55,89,23,77,88};
		
	for(int i=1; i<nums.length; i+=3)
	{
		System.out.print(nums[i]/i +" ");
	}
	}
}
