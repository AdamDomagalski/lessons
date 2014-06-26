package org.domagals;

public class ApiCustomer {

	public int apiCalls;
	public boolean isBlocked;
	
	
	public ApiCustomer(final int alreadyMadeCalls){
		apiCalls = alreadyMadeCalls;
	}
	
	
	public boolean isBlocked(){
		return isBlocked;
	}
	
	public void blockIfNecesary(){
		if(this.apiCalls > 5){
			isBlocked = true;
		}
	}
	
	@Override
	public String toString() {
		return "Klient ma: "+apiCalls + " apiCallsów i "+ (isBlocked? "jest" : "nie jest") +"zablokowany \n"; 
	}
}
