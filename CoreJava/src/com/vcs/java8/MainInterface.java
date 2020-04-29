package com.vcs.java8;

public interface MainInterface {

	void method1(String str);
	
	default void defaultMethod(String str) {
		System.out.println("Default Method  "+str);
	}
	
	@Override
	String toString();
	
	@Override
	boolean equals(Object o);
	
	@Override
	int hashCode();
}
