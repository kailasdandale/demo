package Interviewprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringWithNull {

	public static void main(String[] args) {

		List<String> l = Arrays.asList("Kailas", null, "Dipak", null, "avi", "nitin", "zebra");

		
		l.stream()
		.filter(e->e !=null)
		.sorted()
		.forEach(e->System.out.println(e));
		
		System.out.println("**************");
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
