package com.class33;
import java.util.ArrayList;

public class HW185 {
	/*
	 * Create A array list of type String, call it list. then find out array list is
	 * empty or not. then add value to it "Syntax" the find out list is empty or not
	 */
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		System.out.println(list.isEmpty());
		list.add("Syntax");
		System.out.println(list.isEmpty());
	}
}
