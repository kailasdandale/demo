package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UseFilter {

	public static void main(String[] args) {
		
		
		
		List<Integer>l=Arrays.asList(12,34,5,6,9,9,8,76,34,9);
		
		Integer integer = l.stream().sorted().collect(Collectors.toList()).get(l.size()-2);
		
		System.out.println("secondLarge "+integer);
		
		
		Set<Integer> collect = l.stream()
				.filter(e ->Collections.frequency(l, e)>1)
				.collect(Collectors.toSet());
	
		collect.forEach(System.out::println);
	}
}
