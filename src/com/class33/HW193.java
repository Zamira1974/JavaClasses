package com.class33;

import java.util.ArrayList;

public class HW193 {
/*Create a linkList of type Integer call list, 
Add the values below. 
111
222
333
444
555
666
Create a logic to calculate sum of the all the values in list. 
Print the result only. 
Output. 
Result of sum is 2331  */
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		list.add(555);
		list.add(666);
		
		int sum=0; 
		for(int i : list) {
			 sum+=i;
		}
		System.out.println("Result of sum is "+sum);
	}
}
