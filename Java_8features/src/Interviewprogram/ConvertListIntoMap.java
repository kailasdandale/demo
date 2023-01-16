package Interviewprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListIntoMap {

	public static void main(String[] args) {
		
		List<String> l = Arrays
				.asList("kailas","dipak","ravi","navnit");
		
		
		
		Map<String, Integer> map1 = l.stream()
				.collect(Collectors
						.toMap(String::new, String::length));
		
		System.out.println(map1);
		
		Map<String, String> map = l.stream()
				.collect(Collectors
						.toMap(String::new, String::toUpperCase));
		
		System.out.println(map);
		
	}
}
