package com.class30;

class Main175 implements MyInterfaceHW175 {

	@Override
	public void method1() {
		System.out.println("implementation of method1");
	}
	@Override
	public void method2() {
		System.out.println("implementation of method2");
	}

	public static void main(String[] args) {
		MyInterfaceHW175 obj = new Main175();
		obj.method1();
		obj.method2();
	}
}
