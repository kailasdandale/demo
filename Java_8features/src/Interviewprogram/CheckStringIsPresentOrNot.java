package Interviewprogram;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class CheckStringIsPresentOrNot {

	public static void main(String[] args) {
		
		
		String[] arr={"kailas","ravi","dipak","nisha"};
		
		String s="Kailas";
		
	//	boolean flag=false;
		boolean	flag=Arrays.stream(arr).anyMatch(v->v.equalsIgnoreCase(s));
		
//		if(flag) {
//			System.out.println(s +" is present ");
//		}
//		else {
//			System.out.println(s+" not present");
//		}
		
		int []i= {12,3,54,67,87,65,43,3,12};
		
		Arrays.stream(i).distinct().forEach(r->System.out.println(r));
		 int max = Arrays.stream(i).max().getAsInt();
		
		 System.out.println(max);
		//convert array into list//
		
		 List<Integer> list = Arrays.stream(i).boxed().collect(Collectors.toList());
		
		 int num=124;
		boolean b = 
				 Arrays.stream(i)
				.anyMatch(value -> value==num);
//	
//		if(b) {
//			System.out.println(num+" is present !!");
//	     }	
//		else {
//			System.out.println(num+" not present");
//		}
		
	}
}
