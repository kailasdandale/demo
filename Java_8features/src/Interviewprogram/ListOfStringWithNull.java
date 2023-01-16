package Interviewprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfStringWithNull {

	public static void main(String[] args) {

		List<String> l = Arrays.asList("Kailas", null, "Dipak", null, "avi", "nitin", "zebra");

		List<String>li=new ArrayList<>();
		
		for (String s : l) {
		
			String c=(s == null)?"xxx":s;
			li.add(c);
		}
		
		l=li;
		
		System.out.println(l);
		
//		l.stream()
//		.map(r -> (r == null) ? "default" : r)
//		.map(e -> e.toLowerCase())
//		.sorted().forEach(System.out::println);

	}
}
