package org.domagals.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemoExample {
	// a usecase of a functional interface is a predicate
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		checker(numbers, n -> n%3 == 0);
		checker(numbers, n -> n%2 == 0);
		checker(numbers, n -> n%4 == 0);
	}

	private static void checker(List<Integer> numbers,Predicate<Integer> check) {
		for (Integer number : numbers) {
			if(check.test(number)){
				System.out.println(number);
			}
		}
	}
}
