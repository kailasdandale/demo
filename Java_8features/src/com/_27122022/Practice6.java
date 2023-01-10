package com._27122022;

import java.util.Arrays;
import java.util.Scanner;
/*
 *  check tow String is Anagram String or not!
 * 
 * 
 */
public class Practice6 {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		
		a=a.replace(" ", "");
		b=b.replace(" ", "");
		
		if(a.length()!=b.length()) {
			return false;
		}
		else {
			
			char[] ar1 = a.toLowerCase().toCharArray();
			char[] ar2 = b.toLowerCase().toCharArray();
			
			Arrays.sort(ar1);
			Arrays.sort(ar2);
			return (Arrays.equals(ar1,ar2));
		}
		
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
