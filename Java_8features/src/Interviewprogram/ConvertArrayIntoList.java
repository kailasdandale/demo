package Interviewprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertArrayIntoList {

	public static void main(String[] args) {

		int[] arr = { 12, 34, 55, 66 };

		String[] str = { "kailas", "praKash", "dipak", "ravi" };

		Stream<String> stream2 = Arrays.stream(str);
		List<String> collect = stream2.filter(e -> e.contains("K")).collect(Collectors.toList());
		System.out.println(collect);

		IntStream stream = Arrays.stream(arr);

		int asInt = stream.max().getAsInt();
		System.out.println(asInt);
		// stream.forEach(System.out::println);

	}

}
