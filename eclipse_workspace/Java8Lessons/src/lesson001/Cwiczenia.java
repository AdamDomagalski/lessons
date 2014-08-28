package lesson001;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Cwiczenia {

	
	public static void main(String[] args) {
		List<Apple> jablka = stworzJablka();
		jablka.sort(
				(Apple a1,Apple a2)-> a1.getWeight().compareTo(a2.getWeight())
				);
		
		jablka.sort(Comparator.comparing(Apple::getWeight));
		jablka.forEach(out::println);
		
	}

	private static List<Apple> stworzJablka() {
		return Arrays.asList(new Apple(4),new Apple(7),new Apple(3));
	}
}
