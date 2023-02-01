package TaskJava8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CheckOccuresHowManyTimeOccure {
 
	public static void main(String[] args) {
		
		
		List<Integer> list = List
				.of(1,1,3,4,5,5,6,7,7,88,88,99,8,88,7,1,22,22,3,33,4);
		
		Map<Integer, Integer> map = list.stream()
		.collect(Collectors.toMap(e->e, v->1,Integer::sum));
		
		
		map.forEach((k,v)->{
			System.out.println(k+" occure "+v+" times");
		});
		
	//	list.stream().distinct().sorted().forEach(e->System.out.println(e));
	
//		Integer i = list.stream()
//		.filter(e->e % 2==0)
//		.findAny().get();
//		System.out.println("even "+i);
		
		
	}
}
