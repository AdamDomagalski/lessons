package org.domagals.DEMO;

import java.util.function.Predicate;

public class DEMO_PREDICATE {
	
	
	public static void main(String[] args) {
		
		
		int a= 9;
		asd(a, (n -> n%2 ==0));
		asd(a, (n -> n%3 ==0));
		asd(a, (n -> n-1 ==0));
		
	}
	
	public static int asd(int a,Predicate<Integer> asd){
		if(asd.test(a)){
			return 42;
		}
		
		
		return 3;
	}
}
