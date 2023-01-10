package Interviewprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstCharToUpperCase {

	public static void main(String[] args) {
		
		List<String>list=Arrays.asList("kailas","ravi","dipak","nitin");
		List<String> st = list.stream()
		.map(e->e.substring(0,1).toUpperCase()+e.substring(1))
		.collect(Collectors.toList());
		
		System.out.println(st);
		String ss="kailas dandale";
		String[] sp = ss.split(" ");
		
		for(String dd:sp) {
		String d = dd.substring(0, 1)
				.toUpperCase()+dd.substring(1,dd.length())
				.toLowerCase()+(" ");
		System.out.print(d);
		}
	}
}
