package streamapi;

import java.util.Map;
import java.util.stream.Collectors;

public class CountCharecterInGivenString {

	public static void main(String[] args) {

		String s = "kailas patil";

		Map<String, Long> map = s.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(Object::toString,
						Collectors.counting()));
		map.forEach((k, v) -> {
			System.out.println(k + "--" + v);
		});
 
	}
}
