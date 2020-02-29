package com.class32;

public class EncapsulationDemoHW182 {

		private String empName="John";
		private int empAge=30;
		
	//getting 
		public String getEmpName () {
		return empName;
		}
		
		public int getEmpAge() {
			return empAge;
		}
	
public static void main(String[] args) {
	EncapsulationDemoHW182 obj=new EncapsulationDemoHW182();
	System.out.println("Employee Name: "+ obj.getEmpName());
	System.out.println("Employee Age: "+ obj.getEmpAge());
	}
}
