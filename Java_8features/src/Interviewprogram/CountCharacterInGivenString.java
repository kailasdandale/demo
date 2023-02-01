package Interviewprogram;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterInGivenString {

	public static void main(String[] args) {

		String s = "india";

		Map<Character, Integer> m = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}
		m.entrySet().forEach(e -> {

			System.out.println(e.getKey() + ": " + e.getValue());
		});

	}
}
