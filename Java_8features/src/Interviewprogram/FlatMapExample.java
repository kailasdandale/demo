package Interviewprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {

		int[] arr1 = { 12, 34, 56 };
		int[] arr2 = { 78, 90, 77 };

		IntStream ii = Stream.of(arr2).flatMapToInt(IntStream::of);

	//	ii.forEach(e -> System.out.println(e));

		int i = Stream.of(arr1, arr2).flatMapToInt(IntStream::of).max().getAsInt();

		System.out.println(i);

	}
}
