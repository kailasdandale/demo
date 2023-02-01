package TaskJava8;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateImpl {

	public static void main(String[] args) {
		
		//Predicate<Integer>predicate=t->t%2==0;
		
		//Consumer<Integer>cunsumer=(t)->System.out.println(t);
		
		List<Integer>l=List.of(1,2,3,4,5,6,7,8,23,45);
		
		boolean d =  l.stream().anyMatch(e-> e>44);
		
		System.out.println(d);
		
		
		
		/*
		 * System.out.println("cunsumer implementation"); l.stream().forEach(cunsumer);
		 * 
		 * System.out.println("Predicate implementation");
		 * l.stream().filter(predicate).forEach(e->System.out.println("Even numbers "+e)
		 * );
		 * 
		 * //sort list assecding order// System.out.println("sort list");
		 * l.stream().sorted().forEach(cunsumer); System.out.println("decending order");
		 * 
		 * l.stream() .sorted(Collections.reverseOrder()) .forEach(cunsumer);
		 */
		
//	   System.out.println("Add 2 each");
//	   l.stream().map(e->e+2).forEach(cunsumer);
		
		
			
			
	
	}
}
