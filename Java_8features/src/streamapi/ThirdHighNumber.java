package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class ThirdHighNumber {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(23, 2, 3, 5, 6, 8, 10, 22, 21);

		Integer integer = l.stream().reduce((a, b) -> a + b).get();
		 System.out.println(integer);

		// l.stream().map(e->e + 5).forEach(System.out::println);

		l.stream().mapToDouble(e -> e).map(e -> e + 3).forEach(System.out::println);

		// l.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);

		double d = l.stream().map(e -> e * e).filter(e -> e > 100).mapToInt(e -> e).average().getAsDouble();

		System.out.println(d);
		
		l.stream()
		.filter(e->e %2 !=0)
		.forEach(e->System.out.println("odd numbers : "+e));
		
		
		

	}
}
