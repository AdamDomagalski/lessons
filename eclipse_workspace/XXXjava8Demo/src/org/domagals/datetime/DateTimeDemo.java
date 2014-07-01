package org.domagals.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class DateTimeDemo {

	
	public static void main(String[] args) {
		// to jest reprezentacja z ludzkiego punktu widzenia
		//LocalDate działa na dacie bez godzin
		//LocalTime działa na godzinach bez daty
		//LocalDateTime działa na godzinach i dacie
		
		LocalDateTime now = LocalDateTime.now();
		int nano = now.atZone(ZoneId.of("UTC")).plusYears(2).getNano();
		System.out.println(nano);
		
		
//		System.out.println(ZoneOffset.getAvailableZoneIds());
		
		System.out.println("local:"+
				LocalDateTime.now().toEpochSecond(ZoneOffset.of("+2:00"))
				);
		// dla informacji z punktu widzenia maszyny czasami może nam się przydać
		Instant instantNow = Instant.now();
		System.out.println("Instant: "+ instantNow);
		
		
		System.out.println(instantNow.getEpochSecond());
		
		// do liczenia okresów używamy klasy Period
		LocalDate one = LocalDate.now();
		LocalDate two = LocalDate.now().plusWeeks(3);
		Period between = Period.between(one, two);
		System.out.println(between.getDays());
		
		// Duration
		//to samo co period tylko działa na nanosekundach, do obliczeń maszynowych
		
		
		
	}
}
