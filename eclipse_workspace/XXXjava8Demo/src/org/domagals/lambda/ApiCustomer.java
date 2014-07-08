package org.domagals.lambda;


public class ApiCustomer {

	private int apiCalls;
	private static final int DEFAULT_API_CALLS = 1000;
	private boolean isBlocked;
	
	public ApiCustomer(final int alreadyMadeCalls){
		apiCalls = alreadyMadeCalls;
		isBlocked = false;
	}
	
	public boolean isBlocked(){
		return isBlocked;
	}
	
	public void blockIfNecesary(){
		if(this.apiCalls > DEFAULT_API_CALLS){
			isBlocked = true;
		}
	}
	
	public int getApiCalls(){
		return apiCalls;
	}
	
	@Override
	public String toString() {
		return "Klient ma: "+apiCalls + " apiCallsów i "+ (isBlocked? "jest" : "nie jest") +"zablokowany \n"; 
	}
}
