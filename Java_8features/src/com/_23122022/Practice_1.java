package com._23122022;

import java.util.Arrays;
import java.util.List;

public class Practice_1 {

	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(12,4,5,8);

		int s=sum(l);
		System.out.println(s);
		
	}

	private static int  sum(List<Integer> l) {
		
		Integer i = l.stream().reduce((a,b)->a+b).get();
		
		return i;
	}

}
