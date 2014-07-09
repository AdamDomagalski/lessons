package org.domagals.interfaces;

public interface StaticMethodInterface {

	default void work(){
		System.out.println("work");
	}
	
	public void foo();
	
	
	// In order to avoid util classes for interfaces
	public static String bar(){
		return "I hear and obey"; 
	}
}
