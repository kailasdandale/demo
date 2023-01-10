package com._23122022;

import java.util.Arrays;
import java.util.List;

/*
Given an array of integers
calculate the ratios of its elements that are positive,
negative, and zero. Print the decimal value of each fraction
on a new line with  places after the decimal.*/

public class Practice5 {

	
	public static void plusMinus(List<Integer> arr) {
	    // Write your code here

		double positive=0;
		double negetive=0; 
		double zero=0;
		
		int sizeofArray = arr.size();
		
		//System.out.println("array size : "+arr.size());
		
		for(int i=0;i<arr.size();i++) {
			
			if(arr.get(i)>0) {
				positive++;
			}
			else if(arr.get(i)<0) {
				negetive++;
			}
			else {
				zero++;
			}
		}
	//	System.out.println(positive);
		System.out.println(positive/sizeofArray);
		System.out.println(negetive/sizeofArray);
		System.out.println(zero/sizeofArray);
		

	    }

	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(-4, 3, -9, 0, 4, 1);
		plusMinus(l);
	}
}
