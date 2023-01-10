package com._26122022;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
//uniq charecter//
public class Practice7 {

	public static String superReducedString(String s) {
		// Write your code here

		Map<Character, Integer> mp = new HashMap<>();
		String cc = "";
		for (char c : s.toCharArray()) {

			if (mp.containsKey(c)) {
				mp.put(c, mp.get(c) + 1);
			} else {
				mp.put(c, 1);
			}

		}

		mp.forEach((k, v) -> {
			if (mp.get(k) == 1) {
				System.out.println(k + ":" + v);
			}
		});

		return " ";

	}

	public static void main(String[] args) {

		superReducedString("aaabccddd");
	}
}
