package com._23122022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*Given a square matrix
calculate the absolute difference between the sums of its diagonals.
*/
public class Practice4 {

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here

		
	/*  1 2 3     1+5+9=15
		4 5 6    3+5+9=17
		9 8 9	   17-15=2
	*/
		
	  
	 
		
		
		  int difference = 0;
	        for (int i = 0; i < arr.size(); i++) {
	            difference += arr.get(i).get(i) - arr.get(i)
	            		.get((arr.get(i).size()-1)-i);
	        }
	        
	        return Math.abs(difference);

			/*
			 * System.out.println(left); 
			 * System.out.println(right); 
			 * System.out.println();
			 * return right-left;
			 */

	}

	public static void main(String[] args) {

		List<Integer>arr=Arrays.asList(1,2,3,4,5,6,9,8,9);
		List<List<Integer>>l=new ArrayList<>();
		l.add(arr);
		int i = Practice4.diagonalDifference(l);
		System.out.println(i);
				
				
	}
}
