package com.myPracticalWorks;
import java.util.ArrayList;
import java.util.List;
public class ArrayLISTinJava {
	public static void main(String[] args) {
	
		List<Integer> grades = new ArrayList<Integer>();  
		grades.add(5);
		grades.add(10);
		grades.add(1,7);
	//	grades.clear();       //how to clear the List
		
		System.out.println(grades.get(0));
		System.out.println(grades.get(1));
		System.out.println(grades.get(2));
		System.out.println(grades.contains(7));
		
	}

}
