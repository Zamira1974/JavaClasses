package com.class32;

public class EncapsulationDemoHW181 {
	private String empName;
	private int empAge;
	
//getting 
	public String getEmpName() {
		return empName;
	}
	public int getEmpAge() {
		return empAge;
	}
//setting
	public void setEmpName (String newValueName) {
		empName=newValueName;
	}
	public void serEmpAge (int newValueAge) {
	empAge=newValueAge;
	}
	
public static void main(String[] args) {
	EncapsulationDemoHW181 obj=new EncapsulationDemoHW181();
	obj.setEmpName("Mario");
	obj.serEmpAge(32);

	System.out.println("Employee Name: "+ obj.getEmpName());
	System.out.println("Employee Age: "+ obj.getEmpAge());
	
	}

}
