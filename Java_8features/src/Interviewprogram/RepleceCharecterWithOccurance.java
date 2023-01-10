package Interviewprogram;

public class RepleceCharecterWithOccurance {

	public static void main(String[] args) {

		String s = "inputoutput";
		char replece = 't';
		//check u is present or not in given string //
		if(s.indexOf(replece)==-1) {
			System.out.println("No Repeted charecter...");
			System.exit(0);
		}
		
		int count = 1;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == replece) {
				s = s.replaceFirst(String.valueOf(replece),
						String.valueOf(count));
				count++;
			}
		}
		System.out.println(s);
	}
}
