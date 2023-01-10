package StramApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConverListIntoArray {

	public static void main(String[] args) {
		
		List<Integer>l=new ArrayList<>();
		l.add(12);
		l.add(23);
		l.add(34);
		l.add(54);
		
		Integer[] array2 =  l.toArray(new Integer[l.size()]);
		System.out.println(Arrays.toString(array2));
		
		
	//	Arrays.stream(array2).forEach(e->System.out.println(e));
		
		
		//System.out.println(l);
		//convert List into array//
		/*
		 * Integer[] array = l.toArray(new Integer[l.size()]); for(int a:array) {
		 * System.out.println(a); } //convert array into List
		 * List<Integer>l2=Arrays.asList(array);
		 */
	}
}
