package org.domagals.lambda;


@FunctionalInterface
public interface IntrerfaceDemo {

	public String foobar();
	
	public default String fooO(){
		return "foo";
	}
	
	public static String bar(){
		return "bar";
	}
}
