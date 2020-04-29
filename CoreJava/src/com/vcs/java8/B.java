package com.vcs.java8;

import java.io.IOException;

public class B extends A{

	@SuppressWarnings("finally")
	protected String methodOne() throws IOException {

		System.out.println("Overrided methodOne");
		try {
			if(true) {
				return "if methodOne";
			}
		} catch (Exception e) {
			return "catch methodOne";
		}finally {
			return "finally methodOne";
		}
	}
	
	public static void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("B static methodOne");
	}
	
	public static void main(String[] args) throws IOException {
		B b = new B();
		String result=b.methodOne();
		System.out.println(result);
	}
}
