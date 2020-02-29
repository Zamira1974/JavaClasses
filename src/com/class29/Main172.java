package com.class29;

public class Main172 extends Parent172 {

		@Override
		public void m1() {
		System.out.println("abstract method1 implementation in main class");
		}
		
		public static void main(String[] args) {
			Parent172 obj=new Main172();
			obj.m1();
			obj.m2();
		}
}
