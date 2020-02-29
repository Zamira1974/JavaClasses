package com.class13;

public class ReqularExpression2 {

	public static void main(String[] args) {

		String str = "Today is our JAVA class";
		System.out.println(str.replace(" ", ""));
		System.out.println("******************");
		System.out.println(str.replace("\\s", ""));

		String doc="Video provides a powerful way to help you"
				+"prove your point. When you click Online Video,"
				+"you can paste in the embed code for the video you"
				+"want to add. you can also type a keywordnto search"
				+"online for the video that best fits your document.";
		
		System.out.println(doc.toLowerCase().replace("Video", "Audio"));
		System.out.println(doc.replaceAll("powerful(.*)",""));
		
	}
}
