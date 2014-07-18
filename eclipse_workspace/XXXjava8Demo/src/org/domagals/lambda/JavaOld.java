package org.domagals.lambda;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaOld {

	
	/**
	 * przy pomocy ApiCustomerProvider'a sprawdzić klientów z id 1 do 10
	 * sprawdzić czy są zablokowani i zwrócić listę nie zablokowanych klientów 
	 */
	
	
	public static void main(String[] args) {
		
		List<ApiCustomer> customerList = ApiCustomerProvider.getRandomCustomers();
		List<ApiCustomer> resultCustomerList = new ArrayList<ApiCustomer>();
		
		Instant before = Instant.now();
		for (ApiCustomer apiCustomer : customerList) {
			apiCustomer.blockIfNecesary();
			if(apiCustomer.isBlocked()){
				resultCustomerList.add(apiCustomer);
			}
		}
		Instant after = Instant.now();
		
		Duration old = Duration.between(before, after);
		
//		System.out.println(resultCustomerList);
		
		before = Instant.now();
		List<ApiCustomer> collect = customerList.stream().map(JavaOld::initializeCustomer).filter(ApiCustomer::isBlocked).collect(Collectors.toList());
		after = Instant.now();
		
		Duration newer = Duration.between(before, after);
		
		int compareTo = newer.compareTo(old);
//		System.out.println(collect);
		
		System.out.println("Nowe jest"+ (compareTo>0?" lepsze":"takie samo"));
		
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		System.out.println(LocalTime.now());
	}
	
	private static ApiCustomer initializeCustomer(ApiCustomer apiCustomer){
		apiCustomer.blockIfNecesary();
		return apiCustomer;
	}
}
