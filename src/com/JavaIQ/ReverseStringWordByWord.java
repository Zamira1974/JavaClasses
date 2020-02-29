package com.JavaIQ;
public class ReverseStringWordByWord {
	public static void main(String[] args) {
	
		//Write a java program to reverse String? 
        //Reverse a string word by word?
        
        String str="Today is Sunday and it is a sunny day";
        
        String [] array=str.split(" ");
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i]+" ");
            
        }
        System.out.println("*********************************");
	
        String str1 = "0123456789";
        System.out.println(str1.substring(4));
        
        System.out.println("*********************************");
        
        String word ="abrakadabra";
        String replace=word.replaceAll("[^aAeEiIoOuU]", " ");
        System.out.println(replace);
        
        System.out.println("*********************************");
        
        String str_Sample = "RockStar";
        System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
	}

}
