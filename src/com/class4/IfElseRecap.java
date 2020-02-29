package com.class4;

public class IfElseRecap {

	public static void main(String [ ] args) {
		
	/*  Class schedule
	 * if tuesday  ---> sdlc
	 * if wednesday ---> java review
	 * if thursday ---> sdlc
	 * if saturday ---> Java coding
	 * if sunday ---> my favorite Java coding
	 */
		

	int day=7;
		if(day==2) {
			System.out.println("SDLC class");
		}
		else if(day==3) {
			System.out.println("Java review");	
		} 
		else if(day==4) {
			System.out.println("SDLC class");
		}
		else if(day==6) {
			System.out.println("Java class");
		} 
		else if(day==7) {
			System.out.println("Favorite Java class");
		}
		else {
			System.out.println("There is no class at school");
		}
	
		
	}
	
	
	
}
