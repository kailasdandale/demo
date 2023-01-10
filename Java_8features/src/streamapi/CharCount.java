package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharCount {

	public static void main(String[] args) {

		String ss[] = { "AviNNash", "prakNsh" };

		List<String> collect2 = Arrays.stream(ss).
				filter(e -> e.contains("N"))
				.collect(Collectors.toList());

		System.out.println(collect2);
		
//------------------------------------------------------------------------		
		
		String s = "avi";

		Map<String, Long> collect = s.chars().mapToObj(e -> (char) e)

				.collect(Collectors.groupingBy(Object::toString, Collectors.counting()));

		collect.forEach((k, v) -> {

			System.out.println(k + "--" + v);
		});

	}

}
