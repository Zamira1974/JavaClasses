package com.syntax.whileloop;

public class ForLoop {

	public static void main(String[] args) {
		
		//For loop
		//Say GM 5 times
		//Initialize; test condition; increment
		
	
	//1.	
		for (int i=0; i<=4;  i++) {
			System.out.println("Good morning");
			}
			//print numbers from 1-10;
			for (int i=1; i<=10; i++) {
			System.out.println(i);
			}
			
			//print numbers from 10-1
			for (int i=10; i>=1; i--) {
			System.out.println(i);
			}
			
			for (int i=0; i<=50; i+=5) {
			System.out.println(i);    //5, 10, 15, 20
			}
			
			
//2. 
			
int a = 7 * 3 + 6 / 2 - 5;
int b = 21 - 8 + a % 3 * 11;

if(a < b) {
    System.out.println("A is less than B");
}
if(a == b) {
 System.out.println("A is equal to B");
}
if(a > b) {
 System.out.println("A is greater than B");
}	
			
		
//3.	      
	 for(int i=1; i<15; i=i+3) {
	 System.out.print(i);
	 }	           
		         
//4.	
	 for(int x=20; x<40; x=x+3)   {        
		   System.out.println(x);
		}
	 
//5.
	
	 int x=1;
	 while(x<5) {   
	    x++;   
	    System.out.print(x);
	 }

//6.
	 
	 int m=2, total=0;
	 while(m<6) {
	    total=total+m;
	    m++;
	 }
	 System.out.print(total); 
	 
//7.
	 int z=2, sum=0;
	 while(z<9) {
	    z++;
	    sum=sum+z;
	 }
	 System.out.print(sum);
	 System.out.println("****************");
//8. 	 
	 int k=3, tot=0;
	 do{
	    tot=tot+k;
	    k++;
	 } while(k<11);
	 System.out.print(tot);
	 System.out.println("****************");
	 
	 
//9. 
	 int count = 0;
	 while (count++ < 10) {
	 System.out.println("Welcome to Java");
	 }
	 
	  int d = 0;
	     for (int y = 0; y >= d; ++y, d++) {
	         System.out.print(y + "~");
	         System.out.println(d);
	     }
	  } 
	 	 
	}










