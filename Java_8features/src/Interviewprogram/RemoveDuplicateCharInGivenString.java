package Interviewprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateCharInGivenString {

	public static void main(String[] args) {

		String s = "abcdcgfc";

		
		
		String string = Arrays.asList(s.split(""))
				.stream()
				.distinct()
				.collect(Collectors.joining());

		System.out.println(string);

//		for (int i = 0; i < dd.length; i++) {
//			set.add(dd[i]);
//			
//		}
		// set.forEach(System.out::print);

	}
}
