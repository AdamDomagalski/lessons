package org.domagals.DEMO;


@FunctionalInterface
public interface DEMO_INTERFACE {

	public String fuubar();
	
	public default String bar(){
		return "asd";
	}

	public static String foo(){
		return "asd";
	}
}
