package com.class32;
import java.util.ArrayList;
public class HW190 {
/*Array List Input Loop
Create a ArrayList of Integers called listA
add below values to it. 
(0, 1, 2, 3, 4, 5)
Create another array list of Integer. called listB

Create a logic to the values of listA to listB twice for each values. create a logic the 

Print the listB
Output
[0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5]  */
	
	public static void main(String[] args) {
	
	  ArrayList <Integer> list=new ArrayList<Integer>();
			for(int i=0;i<=5;i++) {
			list.add(i);
			list.add(i);
		}
		System.out.println(list);
		}
	}

