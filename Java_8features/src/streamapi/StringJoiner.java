package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoiner {

	public static void main(String[] args) {

		java.util.StringJoiner j = new java.util.StringJoiner(",");

		j.add("pavn");

		j.add("nam");

		System.out.println(j);
		java.util.StringJoiner j2 = new java.util.StringJoiner(",");

		j2.add("rahul");

		j2.add("namit");

		java.util.StringJoiner merge = j.merge(j2);
		System.out.println(merge);

		/*
		 * List<String>list=Arrays.asList("kailas","vishal","sagar");
		 * 
		 * String collect = list.stream() .collect(Collectors.joining("-", "[", "]"));
		 * 
		 * 
		 * System.out.println(collect);
		 */
	}
}
