package com._26122022;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*

An array is a type of data structure
 that stores elements of the same type 
 in a contiguous block of memory. In an array,
  of size , each memory location has some unique index,  
  (where ), that can be referenced as  
   Reverse an array of integers.

  input=[1,4,3,2];
  output=[2,3,4,1];


*/



public class Practice1 {

	
	 public static List<Integer> reverseArray(List<Integer> a) {
		
		 // Write your code here
		 
		// List<Integer> list = a.stream().collect(Collectors.toList());
		 
		 Collections.reverse(a);
		 return a;
		   
		    }

	public static void main(String[] args) {
		
		List<Integer>l=Arrays.asList(1,4,3,2);
		List<Integer> reverseArray = reverseArray(l);
		System.out.println(reverseArray);
	}
	
	
}
