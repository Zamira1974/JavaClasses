package com.class32;

class EncapsulationDemo {
	private String empName;
	private int empAge;

//getting
	public String getEmpName(){
        return empName;
    }
    public int getEmpAge(){
        return empAge;
    }
//setting
    public void setEmpAge(int newValue){
        empAge = newValue;
    }
    public void setEmpName(String newValue){
        empName = newValue;
    }

public static void main(String[] args) {
		EncapsulationDemo d= new EncapsulationDemo();
		d.setEmpName("John");
		d.setEmpAge(30);
		
		System.out.println("Employee Name: "+d.getEmpName());
		System.out.println("Employee Age: "+d.getEmpAge());
	}		
}
