package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PreventToAddDuplicateInList {

	public static void main(String[] args) {

		int arr[] = { 12, 34, 54, 23, 12, 34, 67, 89, 66, 45, 54, 71 };

		List<Integer> ll = Arrays.asList(12, 34, 54, 23, 12, 34, 67, 89, 66, 45, 54, 74);

		List<Integer> m = ll.stream()
				.map(e -> e.toString())
				.filter(e -> e.startsWith("7") || e.endsWith("4"))
				.map(Integer::valueOf)
				.collect(Collectors.toList());

		System.out.println(m);
		/*
		 * List<Integer> l = new ArrayList<>();
		 * 
		 * for (Integer f : arr) { if (!l.contains(f)) { l.add(f); } }
		 * System.out.println(l);
		 */
	}

}
