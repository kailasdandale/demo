package com._23122022;

import java.util.Arrays;
import java.util.List;

/*   
 * In this challenge, you are required to 
 * calculate and print the sum of the elements in an array,
 * keeping in mind that some of those integers may be quite large.
 *  
 *  
 *  Function Description

Complete the aVeryBigSum function in the editor below.
 It must return the sum of all array elements.

aVeryBigSum has the following parameter(s):

int ar[n]: an array of integers .
   
*/

public class Practice3 {

	public static long aVeryBigSum(List<Long> ar) {
		// Write your code here

		Long l = ar.stream().reduce((a, b) -> a + b).get();

		return l;
	}

	public static void main(String[] args) {

		List<Long> ll = 
				Arrays.asList(1000000001l, 1000000002l, 1000000003l, 1000000004l, 1000000005l);
		long max = aVeryBigSum(ll);
		System.out.println(max);

	}

}
