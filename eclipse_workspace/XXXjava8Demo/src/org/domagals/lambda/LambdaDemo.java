package org.domagals.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaDemo {
	
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12,4,56,7); 
		
		Stream<Integer> distinct = numbers.stream().filter(p -> p > 7).distinct();
		
		List<Integer> collect = distinct.collect(Collectors.toList());
		System.out.println(collect);
		

		List<Integer> numberList = Arrays.asList(1,2,34,6,7,8,23,2,12,4,6,2,2,34,57,6,23);
		List<House> houseList = new ArrayList<>();
		numberList.stream().map(p -> new House(p)).filter(p->p.isBig()).forEach(houseList::add);
		
		System.out.println(houseList);
		
		
		List<Integer> apiCallList = Arrays.asList(1,2,34,6,7,8,23,2,12,4,6,2,2,34,57,6,23);
		
		// jak w jednej linii stworzyć nowego klienta, zablokować jeśli przekroczył limit, wybrać wszystkich klientów nie zablokowanych i zwrócić ich listę
		List<ApiCustomer> customerList = apiCallList.stream().map(p -> {ApiCustomer customer = new ApiCustomer(p);customer.blockIfNecesary(); return customer;}).filter(p->p.isBlocked()).collect(Collectors.toList());
		System.out.println(customerList);
		
//		List<String> planets = Arrays.asList("Earth","Earth","Moon","Earth","Venus","Mars","Mars","Venus");
//		Predicate<? super String> hasLongName = p->p.length() >5;
//		planets.stream().filter(hasLongName).;
		
	}
}

