package com._26122022;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;





/*
 
  Consider an array of numeric strings where each string is a positive
   number with anywhere from  to  digits.
    Sort the array's elements in non-decreasing,
     or ascending order of their integer 
     values and return the sorted array.
 */



public class Practice6 {
	public static List<String> bigSorting(List<String> unsorted) {
	    // Write your code here
		return unsorted.stream()
		.map(e ->Integer.parseInt(e)).sorted()
		.map(String::valueOf)
		.collect(Collectors.toList());
		
	    }
	
	
	
	public static void main(String[] args) {
		List<String>s=Arrays.asList("1","200","150","3");
		List<String> list = bigSorting(s);
		System.out.println(list);
	}
}
