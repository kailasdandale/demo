package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
 
	public static void main(String[] args) {

		List<String> l = Arrays.asList("kailas", "akshay", "sagar", "dipak");

		String string =
				l.stream().map(x -> x.toUpperCase())
				
				.collect(Collectors.joining(","));
		System.out.println(string);
		
	}
}
