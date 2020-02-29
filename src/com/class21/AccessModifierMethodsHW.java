package com.class21;

public class AccessModifierMethodsHW {

	private void m1(){
	    System.out.println("This is Private Method");
	  }
	  void m2(){
	    System.out.println("This is Default Method");
	  }
	  protected void m3(){
	    System.out.println("This is Protected Method");
	  }
	  public void m4(){
	    System.out.println("This is Public Method");
	  }
	
	  public static void main(String[] args) {
		AccessModifierMethodsHW meth= new AccessModifierMethodsHW() ;
				
			meth.m1();
			meth.m2();
			meth.m3();
			meth.m4();
	}	
}
