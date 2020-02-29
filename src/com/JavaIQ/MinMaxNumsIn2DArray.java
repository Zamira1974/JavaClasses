package com.JavaIQ;


public class MinMaxNumsIn2DArray {

	public static void main(String[] args) {
		
		int[][] z= { {5,2,5,8,10},
					{6,8,3,0,2},
					{5,7,9,2,4},
					{9,12,6,3,1},
					{25,6,9,2,-5}
				   };
		
			int min=z[0][0];
			
			for(int i=0; i<z.length;i++) {
				for(int j=0; j<z[i].length; j++) {
					if(z[i][j]<min) {
						min=z[i][j];
					}
				}
			}
			System.out.println("minimum number is "+min);
			
		
			int max=z[0][0];
		
			for (int i=0; i < z.length; i++) {
				for(int j=0; j < z[i].length; j++) {
					if(z[i][j] > max) {
						max=z[i][j];
					}
				}
			}
			
			System.out.println("maximum number is "+max);
	}
}
