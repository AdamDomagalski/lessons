package org.domagals.lambda;

@FunctionalInterface
public interface BlockInterface {

	public abstract ApiCustomer block();
	
//	public default ApiCustomer blockIfNecesairy(ApiCustomer target){
//		target.blockIfNecesary();
//		return target;
//	}
//	
//	public static ApiCustomer block(ApiCustomer target){
//		target.blockIfNecesary();
//		return target;
//	}
}
