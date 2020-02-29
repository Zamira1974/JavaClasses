package com.class33;

import java.util.HashSet;

public class HW195 {
/*Create the HashSet with list of integers add the below numbers for the list
111
111
111
999
999
999
Print the list elements one by one.
output
999
111  */
	public static void main(String[] args) {
		HashSet<Integer> hashS=new HashSet<>();
		hashS.add(111);
		hashS.add(111);
		hashS.add(111);
		hashS.add(999);
		hashS.add(999);
		hashS.add(999);
		
for (int hs: hashS) {
		System.out.println(hs);
	}
  }
}
