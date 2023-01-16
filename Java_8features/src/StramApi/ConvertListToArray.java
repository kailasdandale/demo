package StramApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ConvertListToArray {

	public static void main(String[] args) {
		
		List<Integer>l=Arrays.asList(12,34,5,66,77);
		
		int []arr = l.stream()
				.mapToInt(Integer::valueOf)
				.toArray();
		
		
		IntStream ar = Arrays.stream(arr);
		
		ar.filter(e->e % 2== 0).forEach(r-> System.out.println(r));
		
	}
}
