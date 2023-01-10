package streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicate {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(23, 45, 23, 12, 23, 45, 23);

		Set<Integer> s = new HashSet<>();
		Set<Integer> list = l.stream()
				.filter(e -> !s.add(e))
				.collect(Collectors.toSet());
		System.out.println(list);

	}
}
