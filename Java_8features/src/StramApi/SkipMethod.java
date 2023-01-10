package StramApi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SkipMethod {

	public static void main(String[] args) {
		
	Stream<Integer> s = Stream.of(12,34,6,7,89,89,65,44,32,11,24,68,90);
		
		s.sorted(Comparator.reverseOrder())
				.distinct()
				.skip(1)
				.limit(1).forEach(e->System.out.println(e));
		//System.out.println(l);
		
		/*
		 * System.out.println("second large Number");
		 * l.stream().skip(1).limit(1).forEach(e->System.out.println(e));
		 */
	}
}
