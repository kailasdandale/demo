package Interviewprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumber {
	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(22,45,65,78,98,100,46,25,68,99);
		Integer i = l.stream()
				.sorted()
				.collect(Collectors.toList())
				.get(l.size()-2);
		
		System.out.println(i);
		System.out.println("Using skip and limit");
		List<Integer> ii = 
				l.stream()
				.sorted(Collections.reverseOrder())
		        .skip(1)
		        .limit(1)
		        .collect(Collectors.toList());
		System.out.println(ii);
	}
}
