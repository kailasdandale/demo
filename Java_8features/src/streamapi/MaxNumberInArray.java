package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 23, 56, 87, 98, 99, 34 };

		IntStream s = Arrays.stream(arr);

		// s.sorted().forEach(System.out::println);
		int ll = s.max().getAsInt();

		// System.out.println(ll);

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Maxiumm number :" + max);
		System.out.println("Minimum number :" + min);
	}
}
