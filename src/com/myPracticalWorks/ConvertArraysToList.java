package com.myPracticalWorks;

import java.util.Arrays;
import java.util.List;
public class ConvertArraysToList {
	
	public static void main(String[] args) {

		List<Integer> grades = Arrays.asList(5, 2, 4, 7, 9);

//		System.out.println(grades.size());
//		System.out.println(Arrays.toString(grades.toArray()));
		
	//1st.	
		for (int i = 0; i < grades.size(); i++) {
			grades.set(i, grades.get(i)*2);
			System.out.print(grades.get(i)+" ");          //Output: 10 4 8 14 18 
			}
			System.out.println();
			System.out.println("*************************************");
			
	//2nd.	
			for(int grade: grades) {
			System.out.print(grade+" ");
			}
		
			
	}
}
