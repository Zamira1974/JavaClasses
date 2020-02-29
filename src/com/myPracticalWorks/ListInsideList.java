package com.myPracticalWorks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInsideList {

	public static void main(String[] args) {

		System.out.println("*******************LIST Inside the LIST**************************");

		List<List<Integer>> allGrades = new ArrayList<List<Integer>>();
		allGrades.add(Arrays.asList(11, 22, 33, 44, 55));
		allGrades.add(Arrays.asList(10, 20, 30, 40, 50));
		allGrades.add(Arrays.asList(1, 2, 3, 4, 5));

		for (List<Integer> grades : allGrades) {
			for (int grade : grades) {
				System.out.print(grade + " ");
			}
			System.out.println();
		}
	}

}
