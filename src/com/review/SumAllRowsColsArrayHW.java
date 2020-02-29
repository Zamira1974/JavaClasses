package com.review;
public class SumAllRowsColsArrayHW {
	public static void main(String[] args) {
		
		int[][] a= {
				{11,55,22,80},
				{8,4,3,20},
				{10,20,30,40},
				{6,7,8,9}
				};
		
		int sum0=0;
		int sum1=0;
		int sum2=0;
		int sum3=0;
		
		for (int i=0; i<a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
			if(i==0) {
				sum0+=a[i][j];
			}
			if(i==1) {
				sum1+=a[i][j];
			}
			if(i==2) {
				sum2+=a[i][j];
			}
			if(i==3) {
				sum3+=a[i][j];
			}
			}
		}
		
		int [] column = {sum0, sum1, sum2, sum3};
		for (int i=0; i<column.length; i++) {
			System.out.println(column[i]+" ");
		}	 
	 
}	
}
		
		
		
		
		
		