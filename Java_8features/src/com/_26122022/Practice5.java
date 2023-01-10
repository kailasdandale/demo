package com._26122022;

import java.util.Arrays;
import java.util.List;
/*
 * 
 * find index of given value of given array
 * 
 * 
 * 
 */



public class Practice5 {

	public static int introTutorial(int V, List<Integer> arr) {
		// Write your code here

		int i = arr.indexOf(V);
		return i;
	}

	public static void main(String[] args) {

		List<Integer>l=Arrays.asList(12,34,56,78,98);
		int v = introTutorial(56,l);
		System.out.println(v);
	}
}
