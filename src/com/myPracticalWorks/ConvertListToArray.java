package com.myPracticalWorks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {

		List<Integer> allGrades = Arrays.asList(3, 8, 9, 75, 11);
		int[] grades = new int[allGrades.size()];

		for (int i = 0; i < allGrades.size(); i++) {
			grades[i] = allGrades.get(i);
		}
		System.out.println(Arrays.toString(grades));
		
		
		System.out.println("************* Sort & Reverse a List with Collections **************");
		List<Integer> allGrades1 = Arrays.asList(2, 6, 73, 25, 91);
		Collections.sort(allGrades1);
		Collections.reverse(allGrades1);
		
		for (int grade: allGrades1) {
			System.out.print(grade+" ");   //DESC    91 73 25 6 2 
			
		}
		
		
		
	}

}
