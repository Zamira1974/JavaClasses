package com.class30;


class Main176 implements ChildInterface  {

	@Override
	public void parentMethod() {
		System.out.println("Parent Method ----- welcome to syntax solutions");
	}

	@Override
	public void childMethod() {
		System.out.println("Child Method ----- hi syntax solutions how are you");
	}
		
	public static void main(String[] args) {
		Main176 mm=new Main176();
		mm.parentMethod();
		mm.childMethod();
	}	
}
