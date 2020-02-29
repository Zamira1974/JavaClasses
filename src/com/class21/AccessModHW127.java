package com.class21;

public class AccessModHW127 {

	public static void main(String[] args) {
		AccessModHW127 main = new AccessModHW127();
		System.out.println(main.privateAccess() + ", " + main.defaultAccess() + ", " + main.protectedAccess() + ", "
				+ main.publicAccess());
	}

	private String privateAccess() {
		String str = "private";
		return str;
	}
	
	String defaultAccess() {
		String str = "default";
		return str;
	}

	protected String protectedAccess() {
		String str = "protected";
		return str;
	}

	public String publicAccess() {
		String str = "public";
		return str;
	}
}
