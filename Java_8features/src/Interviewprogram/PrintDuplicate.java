package Interviewprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicate {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,34,56,78,23,23,12,77,78);
		
		
		
		Set<Integer> ss = list.stream()
		.filter(e->Collections.frequency(list, e)>1)
		.collect(Collectors.toSet());
		
		System.out.println(ss);
		System.out.println("*************");
		Set<Integer>l=new HashSet<>();
		//print duplicate using to set
		List<Integer> collect = 
				list.stream()
				.filter(e -> ! l.add(e))
				.collect(Collectors.toList());
		
		System.out.println(collect);
		
		//print duplicate using frequency method //
		
		Set<Integer> o = list.stream()
		.filter(e->Collections.frequency(list, e)>1)
		.collect(Collectors.toSet());
		System.out.println(o);
		
		//add  5 of each element//
		
		List<Integer> add5 = list.stream()
				.map(e->5+e)
				.collect(Collectors.toList());
		
		System.out.println(list);
		System.out.println(add5);
		
		// min 3 from each
		List<Integer> remove3 = list.stream()
				.map(e -> e - 3)
				.collect(Collectors.toList());
		System.out.println(list);
		System.out.println(remove3);
	}
}
