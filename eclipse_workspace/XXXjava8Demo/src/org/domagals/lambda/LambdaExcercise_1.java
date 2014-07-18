package org.domagals.lambda;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import checkers.nullness.quals.NonNull;

public class LambdaExcercise_1 {

	
	/**
	 * przy pomocy ApiCustomerProvider'a sprawdzić klientów z id 1 do 10
	 * sprawdzić czy są zablokowani i zwrócić listę nie zablokowanych klientów 
	 */
	
	public static void main(String[] args) {
		
		@NonNull List<ApiCustomer> customer = null;
		customer = ApiCustomerProvider.getRandomCustomers();
		System.out.println(customer);
		Instant before = Instant.now();
		List<ApiCustomer> collect = customer.stream().map(blockIfNecesairy()).filter(ApiCustomer::isBlocked).collect(Collectors.toList());
		Instant after = Instant.now();
		
		Duration time = Duration.between(before, after);
		System.out.println(time.getNano());
		System.out.println("-=-");
		System.out.println(collect);
	}

	private static Function<ApiCustomer , ApiCustomer> blockIfNecesairy() {
		return x->{x.blockIfNecesary(); return x;};
	}
}
