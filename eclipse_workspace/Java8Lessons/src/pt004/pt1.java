package pt004;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class pt1 {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println("Product: "+product(lista));
		
		System.out.println("Tail: "+tail(lista));
		
		System.out.println("setHead: "+ setHead(33, lista));
	}

	public static Integer product(List<Integer> list) {
		//return list.stream().reduce(1, ((a,  b) -> a * b));
		return list.stream().reduce(1, pt1::mult);
	}

	public static Integer mult(Integer a,Integer b){
		return a*b;
	}
	
	public static List<Integer> tail(List<Integer> list){
		return list.stream().skip(1).collect(Collectors.toList());
	}
	
	public static List<Integer> setHead(Integer head,List<Integer> list){
		// my monster
		/*List<Integer> tail = tail(list);
		tail.add(0, head);
		return tail;
		*/

		// another mutability
		list.stream().skip(1).collect(Collectors.collectingAndThen(Collectors.toList(), l->{l.add(0,head); return l;}));
		
		// the best of google
		return Stream.concat(Stream.of(head),list.stream().skip(1)).collect(Collectors.toList());
	}
}