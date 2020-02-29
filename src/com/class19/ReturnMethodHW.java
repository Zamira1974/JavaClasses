package com.class19;

public class ReturnMethodHW {

/**Create a method createEmail(). Based on provided users name,
	lastName and and email type, your method should return complete email Address. Example: 
	johnsnow@gmail.com or johnsnow@yahoo.com
*/	
	
	String addr(String userName, String lastName,String emailType) {
		
		String addr=userName+lastName+"@"+emailType+".com";
		return addr;
	}
	
	public static void main(String[] args) {
		ReturnMethodHW obj=new ReturnMethodHW();
		String str = obj.addr("john", "snow", "com");
		System.out.println(str);
	}
}

