package com.class29;

	class Main173 extends Parent173{
		  
	@Override
	public void method1() {
		System.out.println("abstract method1 implementation without argument in main class");
		}
	@Override
	public void method2(int a) {
		System.out.println("abstract method2 implementation with argument in main class");
		}		  
	
	public static void main(String[] args) {
		    Parent173 obj=new Main173();
		    obj.method1();
		    obj.method2(200);
	}
}

