package com.class8;

public class ForLoopOddNumbers {

	public static void main(String[] args) {
		
		//print odd numbers from 20 to 50 {2 ways}
		
		for (int k=49; k>=20; k-=2) {
			
			System.out.print(k+"  " );
		}	
		
		System.out.println("*****************************************");

		
		for (int h=21; h<=50; h+=2) {
			
			System.out.print(h+"  " );
		}
		
	
		int sum=0;
	for(int i=1; i<=5; i++) {
		sum=sum+i;
	}
	System.out.println();
	System.out.println(sum);

	System.out.println("*********************************");
	
	//what is the output
	int sumAll=0;
	
	for (int i=0; i<=20; i+=5) {
	 sumAll=sumAll+i;
	}
	System.out.println(sumAll);
	
	System.out.println("*********************************");
	
	
	
	int total=2;
	for (int y=1; y<=3; y++) {
		total=total*y; // 2=2*1; 4=2*2; 12=4*3
	}
	System.out.println(total);
	
	
	
	}
}
