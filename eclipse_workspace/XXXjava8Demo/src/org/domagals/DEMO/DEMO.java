package org.domagals.DEMO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DEMO {

	public static void main(String[] args) {
		
		LocalDate bar = LocalDate.now();
		LocalDate foo = LocalDate.now();
		
		Period.between(foo, bar);
	}
	
}
