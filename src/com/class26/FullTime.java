package com.class26;

public class FullTime extends Employee{
 
	int bonus;
	
	public void getPaid() { //overridding
		System.out.println("Full time employee gets paid "+salary+" and bonus "+bonus);		
	}
}
