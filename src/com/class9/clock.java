package com.class9;

public class clock {

	public static void main(String[] args) {
		
	//1. hours & minutes
		for(int h=0; h<24; h++) {
	
			for (int m=0; m<60; m++) {
				
				if(m<10) {
				System.out.println(h+":"+m);
				}else {
					System.out.println(h+":"+m);
				} } 
		
			
			
	//2. Increment the number 9999 like 0001, 0002,..., 9999
		
		for (int a=0;a<10; a++)
		{
			for (int b=0;b<10; b++) {
				for (int c=0;c<10; c++) {
					for (int d=0;d<10; d++) {
		System.out.println(a+ ""+b + ""+c+""+d+"");
					}
				}
			}	
		}
	}	
}
}
