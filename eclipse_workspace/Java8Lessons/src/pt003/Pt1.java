package pt003;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Pt1 {

	// curry function in java
	static <A,B,C> Function<A,Function<B,C>> curry(BiFunction<A,B,C> fun ){
		return a->b->fun.apply(a,b);
	}
	
	
	static <A,B,C> BiFunction<A,B,C>  uncurry(Function<A,Function<B,C>> fun){
		return (a,b)->fun.apply(a).apply(b);
	}
	
	
	static <A,B,C> Function<A,C> Compose(Function<A,B>f1, Function<B,C> f2){
		return (a) ->f2.apply(f1.apply(a));
	}
}
