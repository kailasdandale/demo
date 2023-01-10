package streamapi;

import java.util.Arrays;
import java.util.List;

public class ToUpperString {

	public static void main(String[] args) {
		
		List<String>l=Arrays.asList("avinash","komal","nisha");
		
		l.stream().map(a->a.toUpperCase()).forEach(x->System.out.println(x));
		
		
		
		
	}
}
