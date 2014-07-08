package org.domagals.lambda;

import java.util.ArrayList;
import java.util.List;

public class ApiCustomerProvider {

	
	public static List<ApiCustomer> getCustomer(){
		List<ApiCustomer> list = new ArrayList<>();
		for(int i=1;i<=10;i++){
			list.add(new ApiCustomer((int)(i* Math.random()*4000)));
		}

		return list;
	}
}
