package org.domagals.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaDemo1 {

	
	public static void main(String[] args) {
		
		List<ApiCustomer> list = ApiCustomerProvider.getRandomCustomers();
		List<ApiCustomer> result = new ArrayList<>();
		for (ApiCustomer apiCustomer : list) {
			apiCustomer.blockIfNecesary();
			if(apiCustomer.isBlocked()){
				result.add(apiCustomer);
			}
		}
		
		list.parallelStream().map(apiCust -> {apiCust.blockIfNecesary(); return apiCust;}).filter(cust -> cust.isBlocked()).collect(Collectors.toList());
	}
}
