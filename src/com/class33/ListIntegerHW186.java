package com.class33;

import java.util.ArrayList;
import java.util.List;

public class ListIntegerHW186 {
/*Create a array list of type Integer
add below elements to it. 
111
222
333
444
555
666
Print elements 1, 3 and 5. you */
 public static void main(String[] args) {
	List<Integer> numbers=new ArrayList<>();
		numbers.add(111);
		numbers.add(222);
		numbers.add(333);
		numbers.add(444);
		numbers.add(555);
		numbers.add(666);
		
	for (int i=0; i<numbers.size(); i+=2) {
		System.out.println(numbers.get(i));
	}		
  }	
}
