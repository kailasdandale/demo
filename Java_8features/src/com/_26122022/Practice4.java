package com._26122022;

/*
 There is a sequence of words in CamelCase as a string of letters,
  having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter 
is uppercase and rest of the letters are lowercase.
Given , determine the number of words in .
Example
There are  words in the string: 'one', 'Two', 'Three'.

 */

public class Practice4 {

	public static int camelcase(String s) {
		// Write your code here

		int count = 1;

		for (int i = 1; i < s.length() - 1; i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {

		int i = camelcase("saveChangesInTheEditor");
	int b=	camelcase("kailasDandale");
		System.out.println(i);
		System.out.println(b);
	}

}
