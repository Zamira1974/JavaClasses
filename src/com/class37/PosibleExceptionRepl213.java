package com.class37;

public class PosibleExceptionRepl213 {
	/*
	 * Complete The program and handle possible exception. Output:
	 * java.lang.ArrayIndexOutOfBoundsException: 4 at Main.main(Main.java:5)
	 */

	public static void main(String[] args) {

		try {
			int[] array = { 10, 20, 30 };
			System.out.println(array[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
