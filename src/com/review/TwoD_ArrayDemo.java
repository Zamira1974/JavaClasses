package com.review;
public class TwoD_ArrayDemo {
	public static void main(String[] args) {
	
	/*1D_Array
		
		int[] a = new int [4];
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		} */
		
		
	//2D_Array	
		int[][] a = new int[3][4];
		a[1][2]=3;
		a[2][1]=5;
		
		for (int row = 0; row < a.length; row++) {
			System.out.print("row"+row + " --> ");
			
			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col]+" ");
			}		
				System.out.println();
			}
	}

}
