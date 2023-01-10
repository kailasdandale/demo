package StramApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LimitMethod {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(12, 12, 4, 34, 67, 89, 9, 776, 65, 54, 4);

		Set<Integer> list = l.stream().sorted()
				.filter(e -> Collections.frequency(l, e) > 1)
				.collect(Collectors.toSet());// 4,12
		System.out.println(list);

		Set<Integer>ss=new HashSet<>();
		Set<Integer> s = l.stream().filter(e->!ss.add(e)).collect(Collectors.toSet());
	
		System.out.println(s);//4,12//
	}
}
