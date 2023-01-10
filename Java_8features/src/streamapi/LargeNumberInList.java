package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargeNumberInList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 34, 65, 87, 98, 65, 43);

		Integer integer = list.stream().sorted()
				.collect(Collectors.toList()).get(list.size() - 2);
	
		System.out.println(integer);
	}
}
