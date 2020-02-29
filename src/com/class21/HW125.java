package com.class21;

/**
 * In main class please declared the variables as following with different
 * access modifiers
 * 
 * private int a=100; protected String name="SyntaxSolutions"; float
 * salary=565656.09f; public String city="Florida";
 * 
 * In main method create print statements and call variables created above. (The
 * order of print statement should be as shown as below) Output: 100
 * SyntaxSolutions 565656.06 Florida
 */

 public class HW125 {

	private int a = 100;
	protected String name = "Syntax Solutions";
	float salary = 565656.09f;
	public String city = "Florida";

	public static void main(String[] args) {
		HW125 obj = new HW125();
		System.out.println(obj.a);
		System.out.println(obj.name);
		System.out.println(obj.salary);
		System.out.println(obj.city);

	}
}
