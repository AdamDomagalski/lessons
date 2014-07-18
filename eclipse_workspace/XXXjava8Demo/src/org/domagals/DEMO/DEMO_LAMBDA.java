package org.domagals.DEMO;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.domagals.lambda.ApiCustomer;
import org.domagals.lambda.ApiCustomerProvider;

public class DEMO_LAMBDA {

	
	
	public static void main(String[] args) {
		
		
		List<ApiCustomer> randomCustomers = ApiCustomerProvider.getRandomCustomers();
		List<ApiCustomer> blockedCustomers = new ArrayList<>();
		for (ApiCustomer apiCustomer : randomCustomers) {
			
			apiCustomer.blockIfNecesary();
			blockedCustomers.add(apiCustomer);
			
		}
		
		List<ApiCustomer> collect = randomCustomers.parallelStream().map(block())
		.filter(api ->api.isBlocked()).collect(Collectors.toList());
	}

	private static Function<? super ApiCustomer, ? extends ApiCustomer> block() {
		return api -> {api.blockIfNecesary(); return api;};
	}
}
