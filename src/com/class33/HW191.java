package com.class33;

import java.util.ArrayList;

public class HW191 {
	/*
	 * Create a ArrayList of type boolean called listA add below to list values
	 * (true, false, false)
	 * 
	 * Create another array list call listB then write a logic to add the same
	 * values of listA to list B twice. Print the List. Output [true, false, false,
	 * true, false, false]
	 */
	public static void main(String[] args) {

		ArrayList<Boolean> listA = new ArrayList<>();
		listA.add(true);
		listA.add(false);
		listA.add(false);

		ArrayList<Boolean> listB = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j<listA.size(); j++) {
				listB.add(listA.get(j));
			}
		}
			System.out.println(listB);
		}
	}

