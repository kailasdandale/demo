package StramApi;

import java.util.Arrays;
import java.util.List;

public class ToLowerCase {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Prakash","sagar","vishal","Akshay");
		l.stream().map(String::toLowerCase)
		.filter(e->e.startsWith("a"))
		.forEach(System.out::print);
	}
}
