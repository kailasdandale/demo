package Interviewprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class AA {

	public static void main(String[] args) {

		List<Integer> l = Arrays
				.asList(12, 34, 66, 77, 88, 99);

		List<Integer> list =
			   l.stream()
				.filter(e -> e % 2 == 0)
				.collect(Collectors.toList());

			list.forEach(e->System.out.println(e));
			
			
			List<String> f = Arrays
					.asList("kailas","patil","ravi","navin","lalit");
			
			List<String> c = f.stream()
			.filter(e->e.contains("p"))
			.map(e->e.toUpperCase())
			.collect(Collectors.toList());
			
			System.out.println(c);
	}
}
