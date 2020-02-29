package com.class33;

import java.util.ArrayList;

public class HW187 {
/*Create an arrayList of type Integer. 

add below values. 
111
111
111
999
999
999
and print all the values of List */
	
public static void main(String[] args) {
	ArrayList<Integer>num=new ArrayList<>();
	num.add(111);
	num.add(111);
	num.add(111);
	num.add(999);
	num.add(999);
	num.add(999);
	
	for (int numbers : num) {
		System.out.println(numbers);
	}
	}
}
