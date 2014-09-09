package pt002;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Pt1 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add =(a,b) -> a+b;
		Function<Integer, Integer> result = partial1(7,add);
		System.out.println(result.apply(3));
	
		Function<Integer,Function<Integer,Integer>> curry = a->b->a+b;
		
		System.out.println(curry.apply(7).apply(1));
	
	}
	
	
	static<A,B,C> Function<B,C> partial1(A a,BiFunction<A,B,C> f){
		return b -> f.apply(a,b);
	}
}
