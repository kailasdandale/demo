package streamapi;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		
		StringRev str=new StringRev();
		System.out.println("Enter a string ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String reverse = str.reverseString(s);
		System.out.println("Reverse string is >>> "+reverse);
		
		
		

	}
	public String reverseString(String ss) {
		 String s="";
		for(int i=ss.length()-1;i>=0;i--) {
			
			 s=s+ss.charAt(i);
			
			
		}
		 return s;
	}
}
