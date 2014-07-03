package org.domagals.annotations;

import java.util.ArrayList;
import java.util.List;

import jdk.nashorn.internal.ir.annotations.Immutable;

import com.sun.istack.internal.NotNull;

public class AnnotationsDemo {

	
	
	public static void main(String[] args) {
		@NotNull @Immutable List<String>  list=  new  ArrayList<>(); 
		@NotNull List<String>  list2= null; 
		
		
		list.add("asd");
		list.add("zxc");
		System.out.println(list);
		
		
	}
}
