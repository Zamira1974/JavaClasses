package com.class32;
import java.util.ArrayList;
public class ArrayListTask {
	
	public static void main(String[] args) {
	
		//Generic 
	ArrayList<String>strList= new ArrayList<>();
		
	strList.add("Montana");
	strList.add("New Hempshpire");
	strList.add("Nebraska");
	strList.add("Oregon");
	strList.add("Uta");
	//str.List.add(10); not possible CE
		
		if(!strList.isEmpty()) {
			int size=strList.size();
			System.out.println(size);
		}
		
for(int i=0; i<strList.size(); i++) {
	System.out.println(strList.get(i));
	System.out.println("------------------------------");
	
}


//ArrayList can be generic and non-generic

	//Non Generic
	ArrayList <Object> alist=new ArrayList<>();
	alist.add("Hello");
	alist.add(100);
	alist.add(10.10);
	alist.add(true);
	alist.add('c');
	
	System.out.println(alist);

	ArrayList<Double> list=new ArrayList<Double>();
	list.add(100.10);
	
	
	}	
}









