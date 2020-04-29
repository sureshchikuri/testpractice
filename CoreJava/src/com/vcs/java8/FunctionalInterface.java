package com.vcs.java8;

public class FunctionalInterface implements MainInterface {

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub

		System.out.println("FunctionalInterface  "+str);
	}
	
	public static void main(String[] args) {
		
		FunctionalInterface interface1 = new FunctionalInterface();
		interface1.method1("Main Function");
		
		interface1.defaultMethod("DefaultMethod");
		
		
	}

}
