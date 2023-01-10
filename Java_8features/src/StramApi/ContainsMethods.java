package StramApi;

import java.util.List;
import java.util.stream.Collectors;

public class ContainsMethods {

	public static void main(String[] args) {

		List<String> list = List.of("kailas", "vishal", "sagar", "harish");
		list.stream().filter(e -> e.contains("k")).collect(Collectors.toList());
		list.stream().filter(e -> e.endsWith("r")).forEach(e -> System.out.println(e));

	}
}
