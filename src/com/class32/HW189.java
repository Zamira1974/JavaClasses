package com.class32;
import java.util.ArrayList;

public class HW189 {

	public static void main(String[] args) {
	ArrayList<String> alist = new ArrayList<>();
	alist.add("hi");
	alist.add("yo");
	alist.add("sup");
	alist.add("yolo");
	alist.add("boop");
	
	alist.remove(0);
	alist.remove(1);
	alist.remove(2);
	
for(String object:alist) {
	System.out.print(object+" ");
	}
}
}
