package com._29122022;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Practice4 {

	public static void main(String[] args) {

		List<String> list = 
				Arrays.asList("vishal", "pavan", "dipak", "ravi");
			
		list.stream()
		.filter(e -> 
		e.contains("a") && e.startsWith("d") && e.length() == 5)
				.forEach(e -> System.out.println(e));
		
		List<String> collect = list.stream()
				.filter(e -> e.equals("dipak"))
				.collect(Collectors.toList());
		System.out.println(collect);

	}
}
