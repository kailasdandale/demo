package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FibonicSerice {

	public static void main(String[] args) {
		
		List<Integer>l=Arrays.asList(1,2,2,3,4,3,2,1,2);
		
		List<String>ll=Arrays.asList("kailas","dandale","java");
		
		
		List<String> collect = ll.stream()
				.map(x->x.replace("dandale","pavan"))
				.collect(Collectors.toList());
		
		System.out.println(collect);
		
		//l.stream().distinct().forEach(System.out::println);
		
		Set<Integer> set = l.stream().filter(e->Collections.frequency(l, e)>1)
				.collect(Collectors.toSet());
	
		set.forEach(System.out::println);
	}
	
}
