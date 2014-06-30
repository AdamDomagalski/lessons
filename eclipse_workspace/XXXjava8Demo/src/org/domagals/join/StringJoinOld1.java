package org.domagals.join;

import java.util.Arrays;
import java.util.List;

public class StringJoinOld1 {

	private static final char SEPARATOR = '_';

	public static final String GEOCODED_HEADER = "Line Number,House Number/House Number(Request),Street/Street(Request),District/District(Request),City/City(Request),"
			+ "State/State(Request),PostalCode/Postcode(Request),SubPostalCode/Sub Postcode(Request),Country/Country(Request),POI/POI Name(Request),Street,";

	public static final List<String> appHeaders = Arrays.asList("a", "b", "c",
			"d", "e", "f");
	public static final List<String> userHeaders = Arrays.asList("a()", "b()",
			"c()", "d()", "e()", "f()");

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		
		for(int i=0;i<appHeaders.size();i++){
			builder.append(appHeaders.get(i));
			builder.append(SEPARATOR);
			builder.append(userHeaders.get(i));
			builder.append(",");
		}

		System.out.println(builder.toString());
	}
}
