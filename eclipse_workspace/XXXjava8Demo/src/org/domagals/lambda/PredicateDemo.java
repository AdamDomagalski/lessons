package org.domagals.lambda;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		int a =8;
		System.out.println(foo(a, n-> n%2==0));
		System.out.println(foo(a, n-> n%3==0));
		System.out.println(foo(a, n-> n-1 ==0));
	}
	
	public static Boolean foo(int a,Predicate<Integer> pred){
		if(pred.test(a)){
			return true;
		}
		return false;
	}
}
