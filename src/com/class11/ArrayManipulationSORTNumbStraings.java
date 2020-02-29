package com.class11;

import java.util.Arrays;

public class ArrayManipulationSORTNumbStraings {

	public static void main(String[] args) {

		
		//1.
		String [] actualNames= {"John", "Smith", "Alex","Mike"};
		String [] expectedNames= { "Smith", "John","Alex","Mike"};
		Arrays.sort(actualNames);
		
		System.out.println(Arrays.toString(actualNames));
		
		//To sort the elements of an Array
		Arrays.sort(expectedNames);
		
		String actual=Arrays.toString(actualNames);
		String expected=Arrays.toString(expectedNames);
		
		System.out.println(actual.equals(expected));
		
		
		//2.
		String firstName="Zum";
		String firstName2="Ali";
		
		String firstName3="Ali";
		String firstName4="Zum";
		
		String actl=firstName+firstName2;
		String expt=firstName3+firstName4;
		System.out.println(actl);
		System.out.println(expt);
		
		
		//3.
		int[] numbers= {123,34,15,66,99};
		
		for(int i:numbers) {
			System.out.print(i+ " ");
		} 
		System.out.println();
		System.out.println("***************");
		
		Arrays.sort(numbers);
		for(int i:numbers) {
			System.out.print(i+" ");
		}
		
		
	}

}
