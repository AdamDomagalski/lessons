package org.domagals.join;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoinNew1 {

	private static final String SEPARATOR = "_";
	
    public static final String GEOCODED_HEADER = "Line Number,House Number/House Number(Request),Street/Street(Request),District/District(Request),City/City(Request),"
            + "State/State(Request),PostalCode/Postcode(Request),SubPostalCode/Sub Postcode(Request),Country/Country(Request),POI/POI Name(Request),Street,";

    public static final List<String> appHeaders = Arrays.asList("a","b","c","d","e","f"); 
    public static final List<String> userHeaders = Arrays.asList("a()","b()","c()","d()","e()","f()");
    
    
    public static String createHeader(final String a, final String b){
    	StringJoiner joiner = new StringJoiner(SEPARATOR);
    	joiner.add(a);
    	joiner.add(b);
    	return joiner.toString();
    }
    
    public static void main(String[] args) {
    	Iterator<String> iterator = userHeaders.iterator();
    	List<Object> collect = appHeaders.stream().map(e -> createHeader(e,iterator.next())).collect(Collectors.toList());
    	System.out.println(collect);
    	
    	
    	// dostać listę headerów rozdzielonych jednym separatorem

    	StringJoiner joiner = new StringJoiner(SEPARATOR);
    	
    	System.out.println("joiner "+userHeaders.stream().reduce("",  (a,b) -> joiner.add(b)+"").toString());
    	
    	StringJoiner joiner2 = new StringJoiner(SEPARATOR);
    	userHeaders.stream().forEach(a->joiner2.add(a));
    	System.out.println("joiner for each "+joiner2.toString());
    	
	}
}
