package com.JavaIQ;

public class Substring {
	public static void main(String[] args) {
		
//4.How to find out the part of the string from a string?
String str="How to find out the part of the string from a string?";
System.out.println(str.contains("hello, i am a computer"));


//What is substring? Find number of words in string?

int count = 0;
if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
{
    for (int i = 0; i < str.length(); i++)
    {
        if (str.charAt(i) == ' ')
        {
            count++;
        }
    }
    count = count + 1; 
}
System.out.println(count);

}
}
