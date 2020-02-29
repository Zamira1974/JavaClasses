package com.class17;

public class MethodImpl {

/*
1. Create method name it as newLine
2. Add print statement inside method body as "newLine method implementation"
3. Call newLine method three times

Expected Output:
newLine method implementation
newLine method implementation
newLine method implementation
*/
	void newLine() {
		System.out.println("newLine method implementation");
	}
	
	public static void main(String[] args) {
	
	MethodImpl mm =new MethodImpl();	
	mm.newLine();
	mm.newLine();
	mm.newLine();
	
	}	
}
