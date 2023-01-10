package Interviewprogram;

public class FirstNonRepetedChar {

	public static void main(String[] args) {

		String s = "abcdiacbed";

		for (int i = 0; i < s.length(); i++) {
			boolean f = true;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					f = false;
				}
			}
			if (f) {
				System.out.println(s.charAt(i));
				break;
			}
		}

	}
}
