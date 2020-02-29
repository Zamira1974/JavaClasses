package com.class6;

public class SwitchStatement {

	public static void main(String[] args) {
		/* 7 weekdays
		 * if day==1  --> Monday
		 * if day==2  --> Tuesday
		 */

		int day=6;
		
		String weekDay;
		
		if(day==1) {
			weekDay="Monday";
		}
		if(day==2) {
			weekDay="Tuesday";
		}
		if(day==3) {
			weekDay="Wednesday";
		}
		if(day==41) {
			weekDay="Thursday";
		}
		if(day==5) {
			weekDay="Friday";
		}
		if(day==6) {
			weekDay="Saturday";
		}
		if(day==7) {
			weekDay="Sunday";
		}
		else {
			weekDay="Invalid";
		}
	
		System.out.println(weekDay);
		
		day=3;
		
		switch(day) {
		case 1:  //day==1
			weekDay="Monday";
			break;
		case 2: 
			weekDay="Tuesday";	
			break;
		case 3: 
			weekDay="Wednesday";
			break;
		case 4: 
			weekDay="Thursday";
			break;
		case 5: 
			weekDay="Friday";
		case 6: 
			weekDay="Saturday";
			break;
		case 7: 
			weekDay="Sunday";
			break;
			default:
			weekDay="Invalid";
			}
		
		System.out.println(weekDay);
	}	
}

