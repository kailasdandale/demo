package Interviewprogram;

import java.util.HashMap;
import java.util.Map;

public class MapSorting {

	public static void main(String[] args) {
		
		
		Map<String, Integer>map=new HashMap<>();
		map.put("two", 2);
		map.put("five", 5);
		map.put("three", 3);
		map.put("nine", 9);
		map.put("eleven", 11);
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
		
		System.out.println("******************");
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
	}
}
