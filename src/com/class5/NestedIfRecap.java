package com.class5;

public class NestedIfRecap {

	public static void main(String[] args) {
	
		
		/*  Verify if button is displayed on the page
		 *  if button is displayed then we need to verify text on 
		 *  if text equal to sign in --> Text case pass
		 *  otherwise ---> Wrong text is displayed  */
		
		
		
		boolean isDisplayed=true;
		String buttonText="SIGN IN";
		
		if(isDisplayed) {
			System.out.println("Button is displayed");
			
			if(buttonText.equals("SIGN IN")) {
				System.out.println("Test Case Pass");
			}else {
				System.out.println("Wrong text is displayed");
			}
			
		}else {
			System.out.println("button is not displayed");
		}
	}

}
