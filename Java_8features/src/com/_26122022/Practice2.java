package com._26122022;

import java.util.Arrays;
import java.util.List;

/*
 
 	Given five positive integers, find the minimum and maximum values
 	 that can be calculated by summing exactly four of the five integers. 
 	Then print the respective minimum and maximum
 	 values as a single line of two space-separated long integers.
 
 */

public class Practice2 {

	public static void miniMaxSum(List<Integer> arr) {
		// Write your code here

		int minSum = 0;
		int maxSum = 0;

		for (int i = 0; i < arr.size()-1; i++) {
			minSum += arr.get(i);
		}
		for (int i = 1; i < arr.size(); i++) {
			maxSum += arr.get(i);
		}

		System.out.print(minSum + " " + maxSum);

	}

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> l2 = Arrays.asList(7,69,2,221,8974);

		miniMaxSum(l2);

	}
}
