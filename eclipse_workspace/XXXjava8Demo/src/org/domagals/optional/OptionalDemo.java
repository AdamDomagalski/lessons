package org.domagals.optional;

import java.util.Optional;

public class OptionalDemo {

	
	public static void main(String[] args) {
		//this will throw a nullpointer exceprion when a null will be passed, used for fail fast on null
//		Optional<String> option = Optional.of(System.currentTimeMillis()%2 ==0?"ala ma kota labo nulla":null);
		
		// this will not fail on null, it will allow you to handle the null in a more sophisiticeted way
		Optional<String> option = Optional.ofNullable(System.currentTimeMillis()%2 ==0?"ala ma kota albo nulla":null);
		
		
		String string = option.filter(p -> !p.isEmpty() && p.length() >4).orElse("Nie ma takiego numeru");
		System.out.println(string);
		
		if(option.isPresent()){
			System.out.println("Jest!!");
		} else{
			System.out.println("Apud, nic tu nie ma!");
		}
		
		System.out.println(Optional.of(null).orElse("Apud!"));
		Optional.ofNullable(null).orElseGet(() -> getRandomString());
	}
	
	public static String getRandomString(){
		//doo stuff
		return "42";
	}
	
}
