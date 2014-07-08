package org.domagals.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaExcercise_1 {

	
	/**
	 * przy pomocy ApiCustomerProvider'a sprawdzić klientów z id 1 do 10
	 * sprawdzić czy są zablokowani i zwrócić listę nie zablokowanych klientów 
	
	 */
	
	public static void main(String[] args) {
		
		List<ApiCustomer> customer = ApiCustomerProvider.getCustomer();
		System.out.println(customer);
		
		
		List<ApiCustomer> collect = customer.stream().map(blockIfNecesairy()).filter(ApiCustomer::isBlocked).collect(Collectors.toList());
		Thread t = new Thread(() -> {System.out.println("go");});
		
		System.out.println("-=-");
		System.out.println(collect);
	}

	private static Function<? super ApiCustomer, ? extends ApiCustomer> blockIfNecesairy() {
		return x->{x.blockIfNecesary(); return x;};
	}
}
