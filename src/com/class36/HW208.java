package com.class36;

import java.util.HashMap;
import java.util.Iterator;

/*Create Hash Map. 
add the follow values

map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");

print the key and values pairs using iterator only

replace with below key THREE--> ASEL and key FIVE-->SUMAIR

Print the values using any kind of loops you like.

OUTPUT
 
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL

 * */
public class HW208 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		
		System.out.println("HashMap Before Replace:");
		
		Iterator<String>keyIterator=map.keySet().iterator();
		while(keyIterator.hasNext()) {
			String itKey=keyIterator.next();
		System.out.println(itKey+ " : " +map.get(itKey));
		}
		
		System.out.println("------------------");
		System.out.println("HashMap After Replace:");
		
		map.replace("THREE", "ASEL");
		map.replace("FIVE", "SUMAIR");
		
		for(String k : map.keySet() ) {
		System.out.println(k+" : "+map.get(k));
			}
		}
	}


