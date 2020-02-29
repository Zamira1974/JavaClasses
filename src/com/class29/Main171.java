package com.class29;
//inherit to class Parent171

public class Main171 extends Parent171 {
	
	@Override
	public void method1() {
		System.out.println("abstract method1 implementation in main class");
	}
	@Override
		public void method2() {
		System.out.println("abstract method2 implementation in main class");
	}
	
public static void main(String[] args) {
		Parent171 mm=new Main171();
		mm.method1();
		mm.method2();
	}	
}
