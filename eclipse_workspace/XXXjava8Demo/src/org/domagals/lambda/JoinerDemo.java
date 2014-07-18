package org.domagals.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class JoinerDemo {

	
	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner("_");
		
		joiner.add("asd");
		joiner.add("asd");
		joiner.add("asd");
		System.out.println(joiner.toString());
		
		
		List<String> asd = Arrays.asList("a","a","a","a","a");
		StringJoiner bbb = new StringJoiner("_akuku_");
		
		asd.stream().forEach(elem -> bbb.add(elem));
		System.out.println(bbb.toString());
	}
}
