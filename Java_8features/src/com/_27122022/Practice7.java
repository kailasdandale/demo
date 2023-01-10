package com._27122022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice7 {

	public static void main(String[] args) {

		String s = "abcd";
		String s2 = "dcba";
		
		s=s.replaceAll("//s", "");
		s2=s2.replaceAll("//s", "");
		char[] ar1 = s.toLowerCase().toCharArray();
		char[] ar2 = s2.toLowerCase().toCharArray();
		
		List<Character>l1=new ArrayList<>();
		List<Character>l2=new ArrayList<>();
		
		for(int i=0;i<ar1.length;i++) {
			l1.add(ar1[i]);
		}
		for(int i=0;i<ar2.length;i++) {
			l2.add(ar2[i]);
		}
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		if(l1.equals(l2)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}
}
