package com.class21;

public class AccessModHW126 {

	private int batch=3;
	private String name="SyntaxSolutions";
	
	private void meth1() {
		System.out.println(batch);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		AccessModHW126 obj= new AccessModHW126();
		obj.meth1();
	}
}
