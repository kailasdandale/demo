package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ContainsMethod {

	public static void main(String[] args) {
		
		
		List<String>l=Arrays.asList("kailas","akshay","vishal");
		
		 l.stream().filter(a->a.contains("l")).forEach(System.out::println);
		 
		 
			/*
			 * int a[]= {1,3,4,5};
			 * 
			 * Arrays.sort(a);
			 * 
			 * System.out.println(a[a.length-2]);
			 */
		
				
	}
}
