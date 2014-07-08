package org.domagals.annotations;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import checkers.igj.quals.ReadOnly;
import checkers.nullness.quals.NonNull;




//org.checkerframework.checker.javari.qual

public class AnnotationsDemo {

	public static void main(String[] args) {
		
		@NonNull Foo bar = null;
		
		Foo foo = new @ReadOnly Foo();
		
		List<String> list = new @ReadOnly ArrayList<>();
		
		list.add("one");
		list.add("two");
		
		System.out.println(foo.concat(list));
	}
}

class Foo{
	
	public @ReadOnly String bar = "Read only";
	
	
	public String concat(@ReadOnly List<String> in){
		StringJoiner join = new StringJoiner("");
		in.add("SUCKERRR");
		in.stream().forEach(join::add);
		return join.toString();
	}
}
