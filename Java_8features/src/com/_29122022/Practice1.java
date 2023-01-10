package com._29122022;

import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;
/*
 * 
 * 
 * Second largest number in Stream //
 */
public class Practice1 {

	public static void main(String[] args) {
		
	Stream<Integer> s = Stream.of(12,34,6,7,89,89,65,44,32,11,24,68,90);
		
		s.sorted(Collections.reverseOrder())
				.distinct().skip(1).limit(1)
				.forEach(e->System.out.println(e));
		
		
		
		//System.out.println(l);
		
		/*
		 * System.out.println("second large Number");
		 * l.stream().skip(1).limit(1).forEach(e->System.out.println(e));
		 */
	}
}