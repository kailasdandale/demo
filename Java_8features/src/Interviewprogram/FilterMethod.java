package Interviewprogram;

import java.util.List;

public class FilterMethod {

	public static void main(String[] args) {
		
		List<String> l = List.of("ravi","pavan","dipak","navin");
		
		l.stream()
		.filter(e->e.equals("ravi"))
		.forEach(System.out::println);
		
		
		
		
		
	}
}
