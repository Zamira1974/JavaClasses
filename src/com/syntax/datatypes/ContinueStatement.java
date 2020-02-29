package com.syntax.datatypes;

public class ContinueStatement {

	public static void main(String[] args) {

		
		for (int i=1; i<=10; i++) 
		{
		if(i==5)   //5 missing in the output
		{
		   continue;
		}
		System.out.println(i);	//1 2 3 4 __ 6 7 8 9 10
		}
	
	

	}

}
