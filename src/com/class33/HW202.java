package com.class33;

import java.util.HashSet;

public class HW202 {
/*Set
Create a hashset contains below values. 
first
second
third
fourth 
fifth 

Create a logic to add the values of hashset to and array.
print the values of array one by one. 
Output:
Array elements: 
third 
fifth 
fourth 
first 
second  */
	public static void main(String[] args) {
		HashSet<String>hS = new HashSet<>();
		hS.add("first");
		hS.add("second");
		hS.add("third");
		hS.add("fourth");
		hS.add("fifth");
		
		String[] arr = new String [5];
		arr=hS.toArray(arr);
		System.out.println("Array elements: ");
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
}
