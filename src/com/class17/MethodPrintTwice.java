package com.class17;

public class MethodPrintTwice {

	void PrintTwice(String s) {

		System.out.println(s);
		System.out.println(s);
	}

	public static void main(String[] args) {

		MethodPrintTwice mm = new MethodPrintTwice();
		mm.PrintTwice("Don't make me say this twice!");
	}
}
