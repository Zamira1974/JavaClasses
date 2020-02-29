package com.myPracticalWorks;
public class PiramidForLoop {
public static void main(String[] args) {
	
/* 1. 
9 8 7 6 5 4 3 2 1 0 
9 8 7 6 5 4 3 2 1 0 
9 8 7 6 5 4 3 2 1 0 
9 8 7 6 5 4 3 2 1 0 
9 8 7 6 5 4 3 2 1 0 
 */
	for(int i=9; i>=0; i--) {
		for(int k=9; k>=0; k--) {
			System.out.print(k+ " ");
		}
		System.out.println();
		}
	
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	

/* 2.
 * 
9 8 7 6 5 4 3 2 1 0 	 
8 7 6 5 4 3 2 1 0 
7 6 5 4 3 2 1 0 
6 5 4 3 2 1 0 
5 4 3 2 1 0 
4 3 2 1 0 
3 2 1 0 
2 1 0 
1 0 
0 
*/
 for(int i=9; i>=0; i--) {
	 for(int k=i; k>=0; k--) {
	System.out.print(k + " ");
	}
	System.out.println();
	}
	
 System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

 /* 3.

9 8 7 
8 7 
7 

5 4 3 2 1 0 
4 3 2 1 0 
3 2 1 0 
2 1 0 
1 0 
0 
*/
 
 for(int i=9; i>=0; i--) {
	 for(int k=i; k>=0; k--) {
		 if(k==6) {
			 break;
		 }
	System.out.print(k + " ");
	}
	System.out.println();
	}
 
 
 System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");	
	

 /*  4.

9 8 7 6 4 3 2 1 0 
8 7 6 4 3 2 1 0 
7 6 4 3 2 1 0 
6 4 3 2 1 0 
4 3 2 1 0 
4 3 2 1 0 
3 2 1 0 
2 1 0 
1 0 
0 
*/
 
 for(int i=9; i>=0; i--) {
	 for(int k=i; k>=0; k--) {
		 if(k==5) {
			 continue;
		 }
	System.out.print(k + " ");
	}
	System.out.println();
	}

 System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");	
 
 
 /* 5.
9 8 7 6 4 3 2 1 0 
8 7 6 4 3 2 1 0 
7 6 4 3 2 1 0 
4 3 2 1 0 
4 3 2 1 0 
3 2 1 0 
2 1 0 
1 0 
0
*/
 
 for(int i=9; i>=0; i--) {
	 if(i==6) {
		 continue;
	 	}
	 for(int k=i; k>=0; k--) {
		 if(k==5) {
		   continue;
		   }
	System.out.print(k + " ");
	}
	System.out.println();
	}

 
 System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");	
 
 
 
 
 
	

}}
