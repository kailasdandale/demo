package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(12, 34,12, 12, 34, 67, 89, 67);

		List<Integer> q = l.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		
		
		System.out.println(q);
		
		Map<String, Long> collect = l.stream()
				.filter(e -> Collections.frequency(l, e) > 1)
				.collect(Collectors.groupingBy
						(Object::toString,Collectors.counting()));

		System.out.println(collect);
		
		Long long1 = l.stream().filter(e->e >20).collect(Collectors.counting());
	}
}
