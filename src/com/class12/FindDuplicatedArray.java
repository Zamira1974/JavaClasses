package com.class12;

public class FindDuplicatedArray {

	public static void main(String[] args) {
	
		int [] array = {2,5,4,7,2,5};
		
		//Find Duplicated values from the array
		
		for (int i=0; i<array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				if(array[i]==array[j]) {
					System.out.println(array[j]);
				}
		}	
		}
	}
}
