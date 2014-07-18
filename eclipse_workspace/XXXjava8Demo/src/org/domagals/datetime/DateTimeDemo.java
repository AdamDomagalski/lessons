package org.domagals.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;

public class DateTimeDemo {

	
	public static void main(String[] args) {
		// to jest reprezentacja z ludzkiego punktu widzenia
		//LocalDate działa na dacie bez godzin
		//LocalTime działa na godzinach bez daty
		//LocalDateTime działa na godzinach i dacie
		
		LocalDateTime now = LocalDateTime.now();
		int nano = now.atZone(ZoneId.of("UTC")).plusYears(2).getNano();
		System.out.println(nano);
		
		
		// for machine usage/information we sometimes may want to use Instant which runs on Epoch time
		Instant instantNow = Instant.now();
		System.out.println("Instant: "+ instantNow);
		
		System.out.println(instantNow.getEpochSecond());
		
		
		// To count Periods we use Period class
		LocalDate one = LocalDate.now();
		LocalDate two = LocalDate.now().plusWeeks(3);
		Period between = Period.between(one, two);
		System.out.println(between.getDays());
		
		one.isAfter(two);
		
		
		
		// Duration
		// the same as Period but runs on epoch time, for machine calculations
	}
}
