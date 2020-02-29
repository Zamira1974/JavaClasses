package com.class11;
public class TwoArraysDemo2 {

	public static void main(String[] args) {
		String [][] names= {
				{"Khan","Yosuf","Alex","Zynab"},
				{"John","Peck","Mike","Zulya", "Huigluf"},
				{"Zara","Sem","Luna","Sofa"},		 
				};
		int lengthOfRows=names.length;
		System.out.println(lengthOfRows);
		
		int lengthOfColum=names[1].length;
		System.out.println(lengthOfColum);
		
		for(String getArrays[]: names) {
			for(String getName: getArrays) {
				System.out.print(getName +" ");
			}
			System.out.println();
		}
	}

}
