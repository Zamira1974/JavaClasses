package com.class33;
import java.util.TreeSet;
public class HW197 {
/*Create Tree Set of type String 
Please add the below values and see the result 
"India"
"Australia"
"South Africa"
"India"
"America"
"America"
Print the Set. 
Output: 
[America, Australia, India, South Africa]
 * */
	public static void main(String[] args) {
		
	TreeSet<String> tSet=new TreeSet<>();
		tSet.add("India");
		tSet.add("Australia");
		tSet.add("South Africa");
		tSet.add("India");
		tSet.add("America");
		tSet.add("America");	
		
		System.out.println(tSet.toString());

		}	
	}

