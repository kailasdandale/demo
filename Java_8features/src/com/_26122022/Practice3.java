package com._26122022;

import java.util.Arrays;
import java.util.List;

/*
 * 
 * You are in charge of the cake for a child's birthday.
 *  You have decided the cake will have one candle for 
 *  each year of their total age. They will only be able 
 *  to blow out the tallest of the candles.
 *  Count how many candles are tallest.
 * 
 * input=[3 2 1 3]
 * output=2;
 
 */

public class Practice3 {

	public static int birthdayCakeCandles(List<Integer> candles) {

		int[] arr = candles.stream().mapToInt(Integer::intValue).toArray();

		int max = arr[0];

		int count = 0;

		int n = candles.size();

		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] == max) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(4, 4, 2, 3);
		List<Integer> l2 = Arrays.asList(3, 2, 1, 3);
		int i = birthdayCakeCandles(l);
		System.out.println(i);

	}
}
