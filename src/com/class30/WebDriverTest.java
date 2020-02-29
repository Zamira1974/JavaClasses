package com.class30;

public class WebDriverTest {
	public static void main(String[] args) {
	
	WebDriver webDr = new ChromeDriver();
		webDr.openBrowser();
		webDr.closeBrowser();
		webDr.maximazeWindow();
		webDr.findElement();
	
		TakesScreenshot ts = new ChromeDriver();
			ts.takesScreenshot();
}}
