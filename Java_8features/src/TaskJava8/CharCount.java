package TaskJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharCount {
 	public static void main(String[] args) {
		
//		String ss="kailas";
//		System.out.println(ss.length());
		
		String []s={"kailas","Vishal","Dipak","Navin"};
		List<String> l = List.of(s);
				Map<String, Integer> map = l.stream()
				.collect(Collectors
						.toMap(String::new,String::length));
		System.out.println(map);
		
		
		
//		map.entrySet()
//		.stream()
//		.sorted(Map.Entry.comparingByValue())
//		.forEach(e->System.out.println(e));
				
		
	}
}
