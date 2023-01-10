package StramApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {

		List<String> ll = Arrays.asList("kailas", "vishal", "ankit", "pavan");
		// ll.stream().sorted().forEach((e) -> System.out.print(e + " "));

		List<String> k = ll.stream().filter(e -> e.contains("k")).collect(Collectors.toList());

		 System.out.println(k);
	}
}
