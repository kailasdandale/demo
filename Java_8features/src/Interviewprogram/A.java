package Interviewprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A {

	public static void main(String[] args) {

		int[] ar = { 12, 34, 54, 77, 88, 99 };

		List<Integer> list =  
				Arrays.stream(ar)
				.boxed()
				.collect(Collectors.toList());
		//convert list into array
	
		int[] array = list.stream()
				.mapToInt(Integer::valueOf).toArray();
		
		System.out.println(list);
		
		IntStream stream = Arrays.stream(ar);
		stream.forEach(e->System.out.println(e));
	//	int[] array = stream.toArray();
	// 	System.out.println(Arrays.toString(array));
		// stream.forEach(System.out::println);

//		List<Integer> l = Arrays.asList(ar);
//
//		System.out.println(l);

	}

}
