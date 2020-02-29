package com.class25_HW;

public class MultMainMeth {

 	public static void main(String str) {
		System.out.println("main "+str);
	}
 	public static void main(String s1, String s2) {
		System.out.println("main "+s1+" "+s2);
	}
	
	public static void main(String[] args) {
		main("Syntax");
		main("Syntax","Solutions");
	}

}
